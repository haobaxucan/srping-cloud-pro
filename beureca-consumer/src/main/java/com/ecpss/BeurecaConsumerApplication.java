package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class BeurecaConsumerApplication {
	/**
	 * 启动 三个eureca 服务
	 * 启动服务提供者 和消费者
	 * 访问 http://localhost:7082/buy?name=xc
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(BeurecaConsumerApplication.class, args);
	}

}
