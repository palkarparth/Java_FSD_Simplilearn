package com.simplilearn.springbootaws;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.springbootaws")
public class SpringbootAwsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsApplication.class, args);
	}

}
