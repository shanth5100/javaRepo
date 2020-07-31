package com.eureka.client.res_mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.res_mapping.feignServ.TestFeign;

@RestController
@RequestMapping("/api")
public class ResourceServTestController {
	
	@Autowired
	private TestFeign testFeign;
	
	@GetMapping("/test")
	private String test() {
		return testFeign.getTestResu();
	}

}
