package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/**
 * 8089端口
 */
public class AeurecaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(AeurecaServer2Application.class, args);
	}

}
