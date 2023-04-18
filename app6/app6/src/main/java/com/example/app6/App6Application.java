package com.example.app6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.app6")
public class App6Application {

	public static void main(String[] args) {
		SpringApplication.run(App6Application.class, args);
		System.out.println("app6 started...");
	}
}
