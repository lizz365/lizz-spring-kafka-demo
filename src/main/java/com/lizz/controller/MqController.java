package com.lizz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: MqController
 * @author: lizz
 */
@RestController
@RequestMapping(value = "mq")
@Slf4j
public class MqController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("send")
    public String sendAlert() {
        String msg = "aaaaa";
        log.info("send alert:{}", kafkaTemplate.send("lizz-test", msg).toString());
        return "success";
    }

}
