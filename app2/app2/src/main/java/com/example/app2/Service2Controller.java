package com.example.app2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@RequestMapping("service2")
	public String service1()
	{
		System.out.println("from service2");
		return "from service2";
	}


}
