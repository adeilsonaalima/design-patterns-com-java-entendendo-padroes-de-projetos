package br.com.adeilsonaalima.builder.cars;

import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Color;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public class SportCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public SportCar(CarType carType, int seats, Engine enine, Transmission transmission, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = enine;
        this.transmission = transmission;
        this.color = color;
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

    public Color getColor() {
        return color;
    }
}
