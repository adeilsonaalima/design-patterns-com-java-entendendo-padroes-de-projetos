package br.com.adeilsonaalima.bridge;

import br.com.adeilsonaalima.bridge.platforms.Facebook;
import br.com.adeilsonaalima.bridge.platforms.IPlatform;
import br.com.adeilsonaalima.bridge.platforms.TwitchTV;
import br.com.adeilsonaalima.bridge.platforms.YouTube;
import br.com.adeilsonaalima.bridge.transmissions.AdvancedLive;
import br.com.adeilsonaalima.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new YouTube());
        System.out.println("---");
        startLive(new TwitchTV());
        System.out.println("---");
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("please wait...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        System.out.println("Advanced Live");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.subtitles();
        advancedLive.comments();
    }
}
