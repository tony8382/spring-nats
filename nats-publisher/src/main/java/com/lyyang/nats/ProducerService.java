package com.lyyang.nats;

import lombok.extern.slf4j.Slf4j;
import org.mvnsearch.spring.boot.nats.core.NatsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProducerService {

    @Autowired
    private NatsTemplate natsTemplate;

    public void publish(String subject, String message) {
        natsTemplate.publish(subject, message.getBytes());
    }
}
