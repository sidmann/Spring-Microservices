package com.example.app12;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import feign.Feign;

@LoadBalancerClient(value="app13")
public class App13LoadBalancer {
	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder()
	{
		return Feign.builder();
	}
}
