package br.com.adeilsonaalima.builder.builders;

import br.com.adeilsonaalima.builder.cars.Car;
import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public class CarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission);
    }
}
