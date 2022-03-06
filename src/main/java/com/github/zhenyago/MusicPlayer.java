package com.github.zhenyago;


import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> playList;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
       Random random = new Random();
       return "Playing " + playList.get(random.nextInt(playList.size())).getSong() + " with volume "  + this.volume;
    }
}
