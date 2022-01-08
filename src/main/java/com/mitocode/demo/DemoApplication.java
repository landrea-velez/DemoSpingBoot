package com.mitocode.demo;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;

@SpringBootApplication
public class DemoApplication{

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	private static IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);	
		LOG.info("Hola desde Spring Boot");
		LOG.warn("Advertencia desde Spring Boot");
		service.registrar("LAURA");	
	}	
}
