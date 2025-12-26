package br.com.adeilsonaalima.bridge.platforms;

public class Facebook implements IPlatform {
    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: Starting transmission");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: authenticated");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: authenticating");
    }
}
