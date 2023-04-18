package com.example.app8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App8Application {

	public static void main(String[] args) {
		SpringApplication.run(App8Application.class, args);
		System.out.println("app8 started...");
	}
}
