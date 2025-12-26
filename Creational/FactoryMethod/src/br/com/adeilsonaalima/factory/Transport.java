package br.com.adeilsonaalima.factory;

import br.com.adeilsonaalima.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
