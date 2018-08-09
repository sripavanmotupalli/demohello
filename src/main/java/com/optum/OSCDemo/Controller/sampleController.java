package com.optum.OSCDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class sampleController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "POC to test Openshift with SpringBoot Applicattion";	
	}
}
