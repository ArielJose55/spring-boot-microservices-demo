package com.microservices.api;

import javax.servlet.http.HttpServletRequest;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.models.Word;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class GetWordController implements ApiCore{

	
	private final ObjectMapper objectMapper;
	
	private final HttpServletRequest request;
	
	@EndpointInject(uri="direct:get-word")
	private FluentProducerTemplate template;
	
	public GetWordController(ObjectMapper objectMapper, HttpServletRequest request) {
		super();
		this.objectMapper = objectMapper;
		this.request = request;
	}



	@Override
	public ResponseEntity<?> getWord(Word body) {
		// TODO Auto-generated method stub
		return null;
	}

}
