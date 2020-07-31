package com.eureka.client.res_mapping.feignServ;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client-service1") // .yml file,  spring.application.name
public interface TestFeign {

	@GetMapping("/eureka/client/test")
	String getTestResu();

}
