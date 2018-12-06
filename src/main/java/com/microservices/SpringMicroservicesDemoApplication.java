package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.services")
@EnableDiscoveryClient
public class SpringMicroservicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDemoApplication.class, args);
	}
}
