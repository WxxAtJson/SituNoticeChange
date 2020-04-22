package com.situ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.*")
@SpringBootApplication
public class SitunoticechangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SitunoticechangeApplication.class, args);
    }

}
