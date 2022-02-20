package com.example.SpringBoot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		System.out.println("Let's inspect the beans provided by the Spring Boot");
        String[] beansName = ctx.getBeanDefinitionNames();
		Arrays.sort(beansName);
		for(String beansname : beansName){
			System.out.println(beansname);
		}
	}
}
