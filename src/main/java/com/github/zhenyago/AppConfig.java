package com.github.zhenyago;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@ComponentScan
@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {


}
