package com.tranning.rabbitmq.controller;

import com.tranning.rabbitmq.service.RabbitMQSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabbitMQController {
    private final RabbitMQSender rabbitMQSender;

    public RabbitMQController(RabbitMQSender rabbitMQSender) {
        this.rabbitMQSender = rabbitMQSender;
    }

    @GetMapping("/producer")
    public String producer() {
        rabbitMQSender.sender("Testing");
        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }
}
