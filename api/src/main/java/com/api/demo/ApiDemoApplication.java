package com.api.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Usage: http://<hostname>[:<prt>]/api/<url>";
	}

	@GetMapping("/api/{url}")
	public String api(@PathVariable String url) {
		return "http://localhost:8080/abcdddd";
	}
}
