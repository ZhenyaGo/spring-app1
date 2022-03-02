package com.github.zhenyago;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    private final List<String> rockPlayList = new ArrayList<>(Arrays.asList("Mary had a little lamb",
            "Bold as Love", "Still got the blues"));

    @Override
    public String getSong() {
        Random random = new Random();
        return rockPlayList.get(random.nextInt(rockPlayList.size()));
    }
}
