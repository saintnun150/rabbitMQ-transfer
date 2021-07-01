package com.spring.server.transfer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {

    private static final String EXCHANGE_NAME = "lowell-exchange";
    private static final String ROUTING_KEY = "lowell-routing-key";
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void run(String... args) {
        log.info("Sending Message...");
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, "Hello Message!");
    }
}
