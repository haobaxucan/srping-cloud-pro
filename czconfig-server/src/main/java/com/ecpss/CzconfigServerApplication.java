package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CzconfigServerApplication {
	/**
	 * 启动
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(CzconfigServerApplication.class, args);
	}

}
