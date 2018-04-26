package com.example.ms.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsDiccoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsDiccoveryApplication.class, args);
    }
}
