package br.com.adeilsonaalima.factory.vehicles;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Motorcycle startRoute");
    }

    @Override
    public void getCargo() {
        System.out.println("Motorcycle getCargo");
    }
}
