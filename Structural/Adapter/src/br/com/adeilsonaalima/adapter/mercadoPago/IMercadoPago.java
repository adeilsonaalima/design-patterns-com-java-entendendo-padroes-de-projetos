package br.com.adeilsonaalima.adapter.mercadoPago;

import br.com.adeilsonaalima.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void mercadoPayment();
    void mercadoReceive();
}
