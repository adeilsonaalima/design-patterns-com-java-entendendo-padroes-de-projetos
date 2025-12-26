package br.com.adeilsonaalima.abstractfactory.factories;

import br.com.adeilsonaalima.abstractfactory.aircrafts.Helicopter;
import br.com.adeilsonaalima.abstractfactory.aircrafts.IAircraft;
import br.com.adeilsonaalima.abstractfactory.landvehicles.ILandVehicle;
import br.com.adeilsonaalima.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
