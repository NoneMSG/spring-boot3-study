package com.personal.sample.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.boot.ApplicationRunner;
import java.util.*;

@SpringBootApplication
public class SampleApplication {

	@Bean
	ApplicationRunner init() {
		return args -> {
				
		};
	}
	interface ExchangeSample {
		@GetExchange("/test/data")
		Map getTestData();
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
