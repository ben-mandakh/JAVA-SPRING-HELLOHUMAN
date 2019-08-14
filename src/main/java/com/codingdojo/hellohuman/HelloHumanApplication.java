package com.codingdojo.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	public String index(@RequestParam(value="name", defaultValue="Human", required=false) String name) {

	        return "<h1> Hello " + name +  "</h1>"
	        		+ "<p> Welcome to Springboot! </p>";
	}
}
