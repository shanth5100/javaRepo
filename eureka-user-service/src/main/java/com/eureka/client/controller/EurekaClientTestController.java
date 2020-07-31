package com.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka/client")
public class EurekaClientTestController {
	
	@GetMapping("/test")
//	private ResponseEntity<?> testMethod() {
//		String msg = "This is Test response";
//		return ResponseEntity.ok(msg);
////		return ResponseEntity.ok().body(msg);
//	}
	String testMethod() {
		String msg = "This is Test response";
		return msg;
	}

}
