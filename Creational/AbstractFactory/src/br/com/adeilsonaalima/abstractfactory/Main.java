package br.com.adeilsonaalima.abstractfactory;

import br.com.adeilsonaalima.abstractfactory.aircrafts.Helicopter;
import br.com.adeilsonaalima.abstractfactory.app.Application;
import br.com.adeilsonaalima.abstractfactory.factories.ITransportFactory;
import br.com.adeilsonaalima.abstractfactory.factories.NineNineTransport;
import br.com.adeilsonaalima.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "Uber";
        // String company = "99";

        if (company.equals("Uber")) {
            factory = new UberTransport();
        } else  {
            factory = new NineNineTransport();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
