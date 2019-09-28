package com.arvind.demosoap.config;

import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;

@EnableWs
@Configuration
public class HelloServiceConfig {

	@Bean
	public ServletRegistrationBean<Servlet> messageDispatcherServlet(ApplicationContext context)
	{
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		
		return new ServletRegistrationBean<Servlet>(servlet,"/ws/*");
	}
	
	@Bean(name = "helloworld")
	public Wsdl11Definition defaultwsdl11defination()
	{
		SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
		wsdl11Definition.setWsdl(new ClassPathResource("/helloworld.wsdl"));
		return wsdl11Definition;
	}
}
