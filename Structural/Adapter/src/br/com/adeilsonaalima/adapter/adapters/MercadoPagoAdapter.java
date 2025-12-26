package br.com.adeilsonaalima.adapter.adapters;

import br.com.adeilsonaalima.adapter.mercadoPago.MercadoPago;
import br.com.adeilsonaalima.adapter.paypal.IPayPalPayments;
import br.com.adeilsonaalima.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private final MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.mercadoPayment();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.mercadoReceive();
    }
}
