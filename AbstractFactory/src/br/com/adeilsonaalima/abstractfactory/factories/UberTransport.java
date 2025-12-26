package br.com.adeilsonaalima.abstractfactory.factories;

import br.com.adeilsonaalima.abstractfactory.aircrafts.Airplane;
import br.com.adeilsonaalima.abstractfactory.aircrafts.IAircraft;
import br.com.adeilsonaalima.abstractfactory.landvehicles.Car;
import br.com.adeilsonaalima.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
