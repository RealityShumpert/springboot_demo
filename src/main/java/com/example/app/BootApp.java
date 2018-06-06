package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.example.demo.controller")
public class BootApp {
    public static void main(String[] args) {
        SpringApplication.run(BootApp.class,args);
        System.out.println("BootApp");
    }
}
