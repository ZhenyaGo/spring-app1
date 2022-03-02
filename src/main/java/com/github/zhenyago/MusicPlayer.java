package com.github.zhenyago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;

    @Autowired
    private RockMusic rockMusic;

    public String playMusic(MusicGenre musicGenre) {
        if(musicGenre.equals(MusicGenre.CLASSICAL)) {
            return "Playing " + classicalMusic.getSong();
        } else {
            return "Playing " + rockMusic.getSong();
        }
    }
}
