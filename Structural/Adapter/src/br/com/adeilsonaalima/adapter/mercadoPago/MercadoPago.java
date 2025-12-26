package br.com.adeilsonaalima.adapter.mercadoPago;

import br.com.adeilsonaalima.adapter.utils.Token;

public class MercadoPago implements IMercadoPago {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPayment() {
        this.token = authToken();
        System.out.println("Sending payment via Mercado Pago");
    }

    @Override
    public void mercadoReceive() {
        System.out.println("Receiving payment via Mercado Pago");
    }
}
