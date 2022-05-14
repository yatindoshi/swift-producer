package com.message.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableDiscoveryClient
@EnableR2dbcRepositories
public class SwiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwiftApplication.class, args);
    }

}
