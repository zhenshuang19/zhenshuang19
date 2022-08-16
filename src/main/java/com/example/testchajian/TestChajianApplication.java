package com.example.testchajian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TestChajianApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestChajianApplication.class, args);
    }

}
