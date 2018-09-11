package com.nxy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.nxy")
public class NdpMonitorApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(NdpMonitorApp.class);
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
