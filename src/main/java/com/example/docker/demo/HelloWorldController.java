package com.example.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@RequestMapping("/rest")
public class DemoApplication {

	@GetMapping("/get")
	Public string sayHello(){
		return "Hello Spring Boot docker"
	}

}
