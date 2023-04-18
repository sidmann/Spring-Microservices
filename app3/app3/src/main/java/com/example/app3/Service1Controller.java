package com.example.app3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@Autowired
	private ProxyForApp4 proxyForApp4;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("i m in service1");
		String results = proxyForApp4.service2();
		return "i am from service1 - " + results;
	}
}
