package br.com.adeilsonaalima.builder.builders;

import br.com.adeilsonaalima.builder.components.CarType;
import br.com.adeilsonaalima.builder.components.Color;
import br.com.adeilsonaalima.builder.components.Engine;
import br.com.adeilsonaalima.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}

