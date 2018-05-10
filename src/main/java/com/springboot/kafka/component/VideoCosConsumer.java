package com.springboot.kafka.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by GaoTao on 2018/5/9
 */
@Component
public class VideoCosConsumer {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(id = "foo", topics = {"test"})
    public void consumerMessage(String message) {
        logger.info("on message:{}", message);
    }
}
