package com.example.app9;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app10")
public interface ProxyForApp10 {
	
	@RequestMapping("service2")
	public String callService2();
}
