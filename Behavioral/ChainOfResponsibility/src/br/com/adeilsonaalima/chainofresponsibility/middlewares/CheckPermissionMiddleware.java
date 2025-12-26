package br.com.adeilsonaalima.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com"))  {
            System.out.println("Welcome Admin!");
            return true;
        }

        System.out.println("Welcome!");
        return checkNext(email, password);
    }
}
