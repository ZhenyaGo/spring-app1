package com.github.zhenyago;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(MusicGenre.CLASSICAL));

//        Computer computer = applicationContext.getBean("computer", Computer.class);
//        System.out.println(computer);


        applicationContext.close();
    }
}
