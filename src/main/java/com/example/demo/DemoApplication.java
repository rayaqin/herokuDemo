package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/numbers")
	@ResponseBody
	String returnNumbers() {
		return String.valueOf(getRandomNumbers(100, 10));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private static String getRandomNumbers(int a, int b) {
		String result = "";
		for(int i=0; i<b; i++){
			result += String.valueOf((int)(a * Math.random())) + " ";
		}
		return result;
	}
}