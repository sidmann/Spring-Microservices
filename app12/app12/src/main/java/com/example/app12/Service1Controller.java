package com.example.app12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@Autowired
	private ProxyForApp13 proxyForApp13;
	
	@RequestMapping("service1")
	public String service1()
	{
		System.out.println("service1");
		return "from service1 - " + proxyForApp13.callService2();
	}
}
