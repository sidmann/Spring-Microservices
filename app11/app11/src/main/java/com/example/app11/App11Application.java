package com.example.app11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App11Application {

	public static void main(String[] args) {
		SpringApplication.run(App11Application.class, args);
		System.out.println("app11 started...");
	}
}
