package com.springbootauth0mongodb.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
@RequestMapping("/")
public class Springboothauth0mongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboothauth0mongodbApplication.class, args);
	}

	@GetMapping
	public String home() {
		return "Springbootauth0mongodb";
	}
}
