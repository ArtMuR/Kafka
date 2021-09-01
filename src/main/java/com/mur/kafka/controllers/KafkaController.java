package com.mur.kafka.controllers;

import com.mur.kafka.services.ProducerClass;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class KafkaController {

    private final ProducerClass producer;

    public KafkaController(ProducerClass producer) {
        this.producer = producer;
    }
    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
    this.producer.sendMessage(message);
        return "Успешно опубликовано";
    }
}
