package com.microservices.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservices.models.Word;

public interface ApiCore {
	
	@RequestMapping(value = "/getStep",
	        produces = { "application/json" }, 
	        consumes = { "application/json" },
	method = RequestMethod.POST)
	ResponseEntity<?> getWord(@RequestBody Word body);

}
