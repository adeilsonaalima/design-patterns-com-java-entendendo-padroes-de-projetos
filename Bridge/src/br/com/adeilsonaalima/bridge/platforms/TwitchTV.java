package br.com.adeilsonaalima.bridge.platforms;

public class TwitchTV implements IPlatform {
    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Starting transmission");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: authenticated");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: authenticating");
    }
}
