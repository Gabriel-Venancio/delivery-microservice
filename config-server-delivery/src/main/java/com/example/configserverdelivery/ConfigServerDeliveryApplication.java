package com.example.configserverdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerDeliveryApplication.class, args);
	}

}
