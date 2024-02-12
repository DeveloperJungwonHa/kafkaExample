package org.example.kafkastudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkastudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkastudyApplication.class, args);
	}

}
