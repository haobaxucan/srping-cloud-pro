package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeurecaProviderApplication {
	/**
	 * 启动eureca集群
	 * 访问
	 * http://localhost:8082/ticket
	 * @param args
	 */

	public static void main(String[] args) {
		
		SpringApplication.run(BeurecaProviderApplication.class, args);
	}

}
