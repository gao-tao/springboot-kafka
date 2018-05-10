package com.springboot.kafka.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by GaoTao on 2018/5/9
 */
@Component
public class KafkaProducer {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage(String topic, String message) {
        logger.info("on message:{}", message);
        kafkaTemplate.send(topic, message);
    }
}
