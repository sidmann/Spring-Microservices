package com.example.app7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@RequestMapping("service2")
	public String service2()
	{
		System.out.println("i m in service2");
		return "i am from service2";
	}
}
