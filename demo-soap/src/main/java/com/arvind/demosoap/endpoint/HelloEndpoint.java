package com.arvind.demosoap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.arvind.demosoap.model.Greeting;
import com.arvind.demosoap.model.ObjectFactory;
import com.arvind.demosoap.model.Person;

@Endpoint
public class HelloEndpoint {

	@PayloadRoot(namespace = "http://codenotfound.com/types/helloworld",
			localPart = "person")
	@ResponsePayload
	public Greeting sayHello(@RequestPayload Person request)
	{
		ObjectFactory factory = new ObjectFactory();
		Greeting response = factory.createGreeting();
		response.setGreeting("Hello "+ request.getFirstName() + " "+ request.getLastName());
		
		return response;
	}
	
}
