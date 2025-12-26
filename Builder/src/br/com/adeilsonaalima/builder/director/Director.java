package br.com.adeilsonaalima.builder.director;

import br.com.adeilsonaalima.builder.builders.IBuilder;
import br.com.adeilsonaalima.builder.builders.IBuilderWithColor;
import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Color;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13800));
    }

    public void constructSportCar(IBuilderWithColor builder) {
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
        builder.setColor(Color.GREY);
    }
}
