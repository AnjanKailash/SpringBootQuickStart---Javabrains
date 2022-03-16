package com.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello") //by default RequestMapping maps to get request if not specified
	public String sayHi() {
		return "Hi";
	}
}
