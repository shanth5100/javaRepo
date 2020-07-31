package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootConfiguration
public class EurekaClientService1 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientService1.class, args);
	}

}
