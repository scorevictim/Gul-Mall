package com.gulmall.gulware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulWareApplication.class, args);
    }

}
