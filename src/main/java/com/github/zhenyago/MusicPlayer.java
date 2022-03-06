package com.github.zhenyago;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> playList;

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }

    public String playMusic() {
       Random random = new Random();
       return "Playing " + playList.get(random.nextInt(playList.size())).getSong();
    }
}
