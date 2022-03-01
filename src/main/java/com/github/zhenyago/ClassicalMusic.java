package com.github.zhenyago;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }
}
