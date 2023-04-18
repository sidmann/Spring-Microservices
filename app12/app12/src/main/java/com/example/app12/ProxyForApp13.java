package com.example.app12;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app14")
public interface ProxyForApp13 {
	
	@RequestMapping("app13/service2")
	public String callService2();
}
