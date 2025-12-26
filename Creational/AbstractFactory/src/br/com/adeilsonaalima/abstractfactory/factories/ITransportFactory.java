package br.com.adeilsonaalima.abstractfactory.factories;

import br.com.adeilsonaalima.abstractfactory.aircrafts.IAircraft;
import br.com.adeilsonaalima.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
