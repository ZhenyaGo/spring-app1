package com.github.zhenyago;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
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
    public List<Music> playList() {
        return Arrays.asList(getClassicalMusic(),getRockMusic(), getRapMusic());
    }

    @Bean
    public MusicPlayer getMusicPlayer() {
        return new MusicPlayer(playList());
    }

    @Bean
    public Computer computer() {
        return new Computer(getMusicPlayer());
    }
}
