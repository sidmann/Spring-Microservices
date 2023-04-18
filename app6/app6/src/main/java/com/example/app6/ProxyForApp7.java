package com.example.app6;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app7")
public interface ProxyForApp7 {
	
	@RequestMapping("service2")
	public String service2(); 
}
