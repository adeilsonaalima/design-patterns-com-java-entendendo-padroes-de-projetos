package br.com.adeilsonaalima.bridge.transmissions;

import br.com.adeilsonaalima.bridge.platforms.IPlatform;

public class Live implements ITransmission {
    protected IPlatform platform;

    public Live() {

    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Starting transmission");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
