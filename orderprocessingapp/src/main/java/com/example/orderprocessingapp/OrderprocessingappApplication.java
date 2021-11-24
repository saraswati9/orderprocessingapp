package com.example.orderprocessingapp;

import com.example.orderprocessingapp.config.ApplicationContextConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(value = {ApplicationContextConfiguration.class})
@SpringBootApplication
public class OrderprocessingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderprocessingappApplication.class, args);
	}

}
