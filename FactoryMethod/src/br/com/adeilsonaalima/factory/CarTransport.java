package br.com.adeilsonaalima.factory;

import br.com.adeilsonaalima.factory.vehicles.Car;
import br.com.adeilsonaalima.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
