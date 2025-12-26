package br.com.adeilsonaalima.adapter.adapters;

import br.com.adeilsonaalima.adapter.payoneer.Payoneer;
import br.com.adeilsonaalima.adapter.paypal.IPayPalPayments;
import br.com.adeilsonaalima.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private final Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adapting Payoneer to existing PayPal methods");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
