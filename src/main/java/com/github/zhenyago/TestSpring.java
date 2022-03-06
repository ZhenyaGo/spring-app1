package com.github.zhenyago;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        Computer computer = applicationContext.getBean(Computer.class);
        System.out.println(computer);

        MusicPlayer musicPlayer = applicationContext.getBean(MusicPlayer.class);
        System.out.println(musicPlayer.getPlayList().size());

        applicationContext.close();
    }
}
