package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AeurecaServer3Application {

	public static void main(String[] args) {
		SpringApplication.run(AeurecaServer3Application.class, args);
	}

}
