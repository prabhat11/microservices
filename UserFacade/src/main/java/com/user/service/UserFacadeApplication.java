package com.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFacadeApplication.class, args);
		System.out.println("hi...");
	}

}
