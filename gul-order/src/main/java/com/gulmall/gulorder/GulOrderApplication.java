package com.gulmall.gulorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulOrderApplication.class, args);
    }

}
