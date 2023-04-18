package com.example.app3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.app3")
public class App3Application {

	public static void main(String[] args) {
		SpringApplication.run(App3Application.class, args);
		System.out.println("app3 started...");
	}
}
