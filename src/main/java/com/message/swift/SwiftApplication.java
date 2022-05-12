package com.message.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@EnableEurekaServer
public class SwiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftApplication.class, args);
	}

}
