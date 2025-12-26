package br.com.adeilsonaalima.adapter.payoneer;

import br.com.adeilsonaalima.adapter.utils.Token;

public interface IPayoneer {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
