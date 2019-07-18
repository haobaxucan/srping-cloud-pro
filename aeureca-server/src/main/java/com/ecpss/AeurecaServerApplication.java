package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AeurecaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeurecaServerApplication.class, args);
	}

}
