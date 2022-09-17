package com.gulmall.gulproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulProductApplication.class, args);
    }

}
