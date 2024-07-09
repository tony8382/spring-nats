package com.lyyang.nats;

import com.lyyang.SpringProjectApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ProducerServiceTest extends SpringProjectApplicationTests {

    @Autowired
    private ProducerService producerService;

    @Test
    void publish() {
        for (int i = 0; i < 10; i++) {
            producerService.publish("subject1", String.valueOf(i));
        }
    }
}