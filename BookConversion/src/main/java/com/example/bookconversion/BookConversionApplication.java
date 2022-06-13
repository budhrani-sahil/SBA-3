package com.example.bookconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BookConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookConversionApplication.class, args);
	}

}
