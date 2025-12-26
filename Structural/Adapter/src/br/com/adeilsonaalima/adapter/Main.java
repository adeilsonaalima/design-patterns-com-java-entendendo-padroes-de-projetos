package br.com.adeilsonaalima.adapter;

import br.com.adeilsonaalima.adapter.adapters.MercadoPagoAdapter;
import br.com.adeilsonaalima.adapter.mercadoPago.MercadoPago;
import br.com.adeilsonaalima.adapter.paypal.IPayPalPayments;

public class Main {
    public static void main(String[] args) {
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());
        payment.paypalPayment();
        payment.paypalReceive();
    }
}
