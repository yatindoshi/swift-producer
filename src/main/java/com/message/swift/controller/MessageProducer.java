package com.message.swift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MessageProducer {

    @GetMapping("hello/{name}")
    public Mono<String> getHello(@PathVariable("name") String name){
        return Mono.just(name);
    }
}
