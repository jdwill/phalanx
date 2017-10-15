package com.jdwill.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.jdwill"})
public class OAuth2ResourceServer {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceServer.class, args);
	}
}
