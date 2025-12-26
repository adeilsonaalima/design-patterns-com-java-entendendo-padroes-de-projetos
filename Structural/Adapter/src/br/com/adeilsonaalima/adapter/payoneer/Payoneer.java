package br.com.adeilsonaalima.adapter.payoneer;

import br.com.adeilsonaalima.adapter.utils.Token;

public class Payoneer implements IPayoneer {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = authToken();
        System.out.println("Sending payment via payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Receiving payment via payoneer");
    }
}
