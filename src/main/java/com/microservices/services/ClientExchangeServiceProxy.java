package com.microservices.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.entities.Client;

@FeignClient(name="forex-service",url="localhost:8000")
public interface ClientExchangeServiceProxy {

	@GetMapping("/get-client/{name}/and/{lastName}")
	public Client findClient(@PathVariable("name") String name, @PathVariable("lastName") String lastName);
}
