package com.lizz.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @description: AlertMqListener
 * @author: lizz
 * @date: 2021/7/14 11:05
 */
@Component
@Slf4j
public class AlertMqListener {
    @KafkaListener(topics = "lizz-test") //,groupId = "lizz-consumer"
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        log.info("kafka mq:{}", cr.toString());
    }
}
