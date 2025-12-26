package br.com.adeilsonaalima.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
