package com.example.app12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.app12")
public class App12Application {

	public static void main(String[] args) {
		SpringApplication.run(App12Application.class, args);
		System.out.println("app12 started...");
	}
}
