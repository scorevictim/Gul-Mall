package com.gulmall.gulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulGatewayApplication.class, args);
    }

}
