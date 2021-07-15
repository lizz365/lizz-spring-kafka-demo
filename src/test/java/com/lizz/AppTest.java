package com.lizz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
{
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Test
    void sendKafkaMq(){
		kafkaTemplate.send("lizz-test", "aaaaaaa");
    }

}
