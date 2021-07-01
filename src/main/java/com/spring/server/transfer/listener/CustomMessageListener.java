package com.spring.server.transfer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomMessageListener {
    @RabbitListener(queues = "lowell-queue")
    public void receiveMessage(final Message message) {
        log.info("message:{}", message);
    }
}
