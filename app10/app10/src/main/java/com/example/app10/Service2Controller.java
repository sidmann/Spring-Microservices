package com.example.app10;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@RequestMapping("service2")
	public String service2()
	{
		System.out.println("service2");
		return "service2 - " + this;
	}
}
