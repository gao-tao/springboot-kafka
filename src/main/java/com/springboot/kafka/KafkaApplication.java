package com.springboot.kafka;

import com.springboot.kafka.component.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class KafkaApplication {

	@Autowired
	private KafkaProducer kafkaProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	//然后每隔1分钟执行一次
	@Scheduled(fixedRate = 1000 * 60)
	public void testKafka() throws Exception {
		kafkaProducer.sendMessage("test","hello");
	}
}
