package com.github.zhenyago;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired
    ClassicalMusic classicalMusic;

    @Autowired
    RockMusic rockMusic;

    @Autowired
    RapMusic rapMusic;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    List<Music> playList;

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
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
