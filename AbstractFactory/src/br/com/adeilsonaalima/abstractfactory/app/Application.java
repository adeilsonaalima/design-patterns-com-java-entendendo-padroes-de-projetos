package br.com.adeilsonaalima.abstractfactory.app;

import br.com.adeilsonaalima.abstractfactory.aircrafts.IAircraft;
import br.com.adeilsonaalima.abstractfactory.factories.ITransportFactory;
import br.com.adeilsonaalima.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
