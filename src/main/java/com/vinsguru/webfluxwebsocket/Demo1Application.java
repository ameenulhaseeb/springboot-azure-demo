package com.vinsguru.webfluxwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Demo1Application {

	@GetMapping("/message")
	public String getMessage() {
		return "Inside Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
