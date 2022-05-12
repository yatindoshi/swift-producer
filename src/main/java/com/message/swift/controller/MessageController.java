package com.message.swift.controller;

import com.message.swift.kafka.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("generate")
    public Mono<String> getHello(@RequestBody String message) {
        messageProducer.sendMessage(message);
        return Mono.just(message);
    }
}
