package com.github.zhenyago;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = applicationContext.getBean("musicBean", RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);//using IoC

        musicPlayer.playMusic();

        applicationContext.close();
    }
}
