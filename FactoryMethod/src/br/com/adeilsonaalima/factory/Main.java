package br.com.adeilsonaalima.factory;

import br.com.adeilsonaalima.factory.vehicles.Motorcycle;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "Motorcycle":
                transport = new MotorcycleTransport();
                break;
            case "Car":
                transport = new CarTransport();
                break;
            default:
                System.out.println("Choose a type of transport");
        }
    }
}
