package com.example.panospringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.panospringboot.panoplayer.mapper")
public class PanoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanoSpringBootApplication.class, args);
    }

}
