package br.com.adeilsonaalima.builder.builders;

import br.com.adeilsonaalima.builder.cars.Car;
import br.com.adeilsonaalima.builder.cars.SportCar;
import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Color;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public class SportCarBuilder implements IBuilderWithColor {
    private Color color;
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

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

    public SportCar getResult() {
        return new SportCar(carType, seats, engine, transmission, color);
    }
}
