package br.com.adeilsonaalima.bridge.transmissions;

import br.com.adeilsonaalima.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {
    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("subtitles");
    }


    public void comments() {
        System.out.println("comments");
    }
}
