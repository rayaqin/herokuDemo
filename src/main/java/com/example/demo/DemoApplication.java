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

	private static int[] getRandomNumbers(int a, int b) {
		int[] result = new int[b];
		for(int i=0; i<b; i++){
			result[i] = a + (int) ((1 - a) * Math.random());
		}
		return result;
	}
}