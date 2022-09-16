package com.gulmall.gulproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gulmall.gulproduct.dao")
@SpringBootApplication
public class GulProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulProductApplication.class, args);
    }

}
