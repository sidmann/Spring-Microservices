package com.example.app9;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "app10")
public class App10LoadBalancer {
	
	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder()
	{
		return Feign.builder();
	}
}
