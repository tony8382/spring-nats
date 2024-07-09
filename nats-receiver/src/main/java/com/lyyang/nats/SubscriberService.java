package com.lyyang.nats;

import io.nats.client.Message;
import lombok.extern.slf4j.Slf4j;
import org.mvnsearch.spring.boot.nats.annotation.NatsSubscriber;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@Slf4j
public class SubscriberService {

    @NatsSubscriber(subject = "subject1")
    public void handler(Message msg) {
        log.info("HIHI:{}", new String(msg.getData(), StandardCharsets.UTF_8));
    }

}
