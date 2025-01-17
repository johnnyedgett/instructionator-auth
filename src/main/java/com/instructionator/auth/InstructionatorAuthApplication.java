package com.instructionator.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class InstructionatorAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstructionatorAuthApplication.class, args);
	}

}
