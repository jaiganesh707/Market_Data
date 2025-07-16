package com.example.MarketExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MarketExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarketExampleApplication.class, args);
	}

}
