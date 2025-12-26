package br.com.adeilsonaalima.adapter.paypal;

import br.com.adeilsonaalima.adapter.utils.Token;

public class PayPal implements IPayPalPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Sending payments via PayPal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Receiving payments via PayPal");
    }
}
