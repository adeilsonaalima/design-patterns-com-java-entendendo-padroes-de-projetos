package br.com.adeilsonaalima.bridge.platforms;

public class YouTube implements IPlatform {
    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: Starting transmission");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: authenticated");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: authenticating");
    }
}
