package com.github.zhenyago;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic1 = applicationContext.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
//        Music music = applicationContext.getBean("musicBean", Music.class);

//        MusicPlayer firstMusicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());



//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        musicPlayer.playMusic();

        applicationContext.close();
    }
}
