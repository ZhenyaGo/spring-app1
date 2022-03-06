package com.github.zhenyago;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer getMusicPlayer() {
        return new MusicPlayer(Arrays.asList(getClassicalMusic(),getRockMusic(), getRapMusic()));
    }

    @Bean
    public Computer computer() {
        return new Computer(getMusicPlayer());
    }
}
