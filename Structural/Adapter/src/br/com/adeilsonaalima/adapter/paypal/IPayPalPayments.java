package br.com.adeilsonaalima.adapter.paypal;

import br.com.adeilsonaalima.adapter.utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
