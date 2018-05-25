package com.github.pedrodimoura.cesarmesspringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class CesarMesSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CesarMesSpringBatchApplication.class, args);
	}
}
