package br.com.adeilsonaalima.chainofresponsibility.middlewares;

import br.com.adeilsonaalima.chainofresponsibility.server.Server;

public class CheckUserMiddleware extends Middleware {
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email) || !server.isValidPassword(email, password)) {
            System.out.println("Email or Password Not Found");
            return false;
        }

        return checkNext(email, password);
    }
}
