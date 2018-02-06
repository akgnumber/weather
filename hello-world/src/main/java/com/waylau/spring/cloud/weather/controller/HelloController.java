package com.waylau.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 * @author Administrator
 */
@RestController
public class HelloController {
	
	@GetMapping("/hello")
//	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
