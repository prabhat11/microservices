package com.user.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService {
	@GetMapping(value = "/")
	public String printName() {
		//System.out.println("hi my name is prabhat...");
		return "hi this string returned from api";
	}

}
