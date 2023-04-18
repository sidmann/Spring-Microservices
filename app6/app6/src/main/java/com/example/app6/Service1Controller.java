package com.example.app6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@Autowired
	private ProxyForApp7 proxyForApp7;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("i m in service1");
		return "i am from service1 - " + proxyForApp7.service2();
	}

}
