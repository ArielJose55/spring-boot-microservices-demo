package com.microservices.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class GetWordRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("direct:get-word")
		.setHeader(Exchange.HTTP_METHOD, constant("POST"))
		.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
		.to("http4://localhost:8100/traduction");
	}

}
