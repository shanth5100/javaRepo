package com.zuul.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootConfiguration
public class TestZuulAPIGateway {

	public static void main(String[] args) {
		SpringApplication.run(TestZuulAPIGateway.class, args);
	}

}
