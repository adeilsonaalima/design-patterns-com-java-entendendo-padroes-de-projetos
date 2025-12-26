package br.com.adeilsonaalima.factory.vehicles;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Car startRoute");
    }

    @Override
    public void getCargo() {
        System.out.println("Car getCargo");
    }
}