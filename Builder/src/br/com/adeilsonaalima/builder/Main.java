package br.com.adeilsonaalima.builder;

import br.com.adeilsonaalima.builder.builders.CarBuilder;
import br.com.adeilsonaalima.builder.builders.SportCarBuilder;
import br.com.adeilsonaalima.builder.builders.TruckBuilder;
import br.com.adeilsonaalima.builder.cars.Car;
import br.com.adeilsonaalima.builder.cars.SportCar;
import br.com.adeilsonaalima.builder.cars.Truck;
import br.com.adeilsonaalima.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);
        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + " produzido com sucesso");
    }
}
