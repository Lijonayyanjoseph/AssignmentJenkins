package com.example2.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Application {

	@RequestMapping("/")
	String hello() {
		return "Hello World, Spring Boot!";
	}
}
