package com.example.spring_ec2_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringEc2DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEc2DockerApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return ("Hello this is my spring app");
	}


}
