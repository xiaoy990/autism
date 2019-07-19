package com.join.autism;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.join.autism.mapper")
@SpringBootApplication
public class AutismApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutismApplication.class, args);
    }

}