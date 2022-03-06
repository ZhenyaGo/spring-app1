package com.github.zhenyago;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        Computer computer = applicationContext.getBean(Computer.class);
        System.out.println(computer);

        applicationContext.close();
    }
}
