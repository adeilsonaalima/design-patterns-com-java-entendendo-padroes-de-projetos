package br.com.adeilsonaalima.chainofresponsibility;

import br.com.adeilsonaalima.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.adeilsonaalima.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.adeilsonaalima.chainofresponsibility.middlewares.Middleware;
import br.com.adeilsonaalima.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("admin@example.com", "123456789");
        server.registerUser("user@example.com", "987654321");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.println("E-mail:");
            String email = reader.readLine();
            System.out.println("Password:");
            String password = reader.readLine();
            done = server.login(email, password);
        } while (!done);
    }


}
