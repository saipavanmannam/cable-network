package com.cable.network;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class CableNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CableNetworkApplication.class, args);
	}
}
