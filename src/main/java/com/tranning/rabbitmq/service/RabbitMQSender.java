package com.tranning.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
    private String queue = "queue1";
    private String exchange = "exchange1";
    private String routingKey = "routingKey1";

    private final AmqpTemplate rabbitTemplate;

    public RabbitMQSender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sender(String data) {
        rabbitTemplate.convertAndSend(exchange, routingKey, data);
    }
}
