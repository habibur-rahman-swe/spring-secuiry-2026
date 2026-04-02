package com.spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class WeatherController {
	
	@GetMapping("/weather")
	public String getWeather() {
		return "The weather is sunny.";
	}
	
}
