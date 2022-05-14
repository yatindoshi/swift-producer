package com.message.swift.controller;

import com.message.swift.MessageRepository;
import com.message.swift.domain.Message;
import com.message.swift.kafka.MessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@Slf4j
public class MessageController {

    private MessageRepository messageRepository;

    private MessageProducer messageProducer;

    public MessageController(MessageRepository messageRepository, MessageProducer messageProducer) {
        this.messageRepository = messageRepository;
        this.messageProducer = messageProducer;
    }

    @PostMapping("messages")
    @Transactional
    public Mono<Void> getHello(@RequestBody String message) {
        log.info("message has been received in controller");
        messageProducer.sendMessage(message);
        return messageRepository.save(new Message(UUID.randomUUID().toString(), message))
                .then();
    }

    @GetMapping("messages")
    public Flux<Message> getMessages() {
        return messageRepository.findAll();
    }
}
