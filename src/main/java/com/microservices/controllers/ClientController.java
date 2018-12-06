package com.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entities.Client;
import com.microservices.repositories.ClientRepository;
import com.microservices.services.ClientExchangeServiceProxy;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class ClientController {

	@Autowired
	private ClientExchangeServiceProxy proxy;

	@GetMapping("/fixed-client/{name}/and/{lastName}")
	public Client getClient(@PathVariable String name, @PathVariable String lastName) {
		
		Client response = proxy.findClient(name, lastName);
		log.info("{}", response);
		return new Client(response.getId(), response.getName(), response.getLastName(), response.getBirthday());		
	}
}
