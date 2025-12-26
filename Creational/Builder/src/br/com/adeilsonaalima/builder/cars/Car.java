package br.com.adeilsonaalima.builder.cars;

import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Color;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Car(CarType carType, int seats, Engine enine, Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = enine;
        this.transmission = transmission;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
