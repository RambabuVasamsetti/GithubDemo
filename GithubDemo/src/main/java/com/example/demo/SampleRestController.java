package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	
	@RequestMapping("/springboot")
	public String hello() {
		return "First SpringBoot Application";
	}
	

}
