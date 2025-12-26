package br.com.adeilsonaalima.factory;

import br.com.adeilsonaalima.factory.vehicles.IVehicle;
import br.com.adeilsonaalima.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
