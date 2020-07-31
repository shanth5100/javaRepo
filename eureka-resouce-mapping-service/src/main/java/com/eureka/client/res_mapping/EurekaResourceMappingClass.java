package com.eureka.client.res_mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootConfiguration
public class EurekaResourceMappingClass {

	public static void main(String[] args) {
		SpringApplication.run(EurekaResourceMappingClass.class, args);
	}

}
