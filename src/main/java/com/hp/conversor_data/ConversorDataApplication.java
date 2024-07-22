package com.hp.conversor_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient 
public class ConversorDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorDataApplication.class, args);
	}

}
