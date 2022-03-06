package com.github.zhenyago;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {

    private final List<String> classicalPlayList = new ArrayList<>(Arrays.asList("Hungarian Rhapsody",
            "Пятая симфония", "Шестая симфония"));

    @Override
    public String getSong() {
        Random random = new Random();
        return classicalPlayList.get(random.nextInt(classicalPlayList.size()));
    }
}
