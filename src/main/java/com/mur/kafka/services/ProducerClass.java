package com.mur.kafka.services;

import com.mur.kafka.controllers.KafkaController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;


public class ProducerClass {
    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);
    private static final String TOPIC = "user";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String message){
        logger.info(String.format("******** Consumer получил сообщение ******* -> %s"), message);
        this.kafkaTemplate.send(TOPIC,message);
    }
}
