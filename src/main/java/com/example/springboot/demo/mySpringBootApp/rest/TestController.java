package com.example.springboot.demo.mySpringBootApp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!. The time is: " + LocalDateTime.now() + ".";
	}
	
	@GetMapping("/weather")
	public String getWeather() {
		return "Today is sunny.";
	}
}
