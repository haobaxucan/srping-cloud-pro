package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
@EnableFeignClients
public class BeurecaFeignConsumerApplication {
	/**
	 * feign demo这里也实现服务降级
	 * 方法fallback =DemoServiceFallback.class
	 * @param args
	 */

	public static void main(String[] args) {
		
		SpringApplication.run(BeurecaFeignConsumerApplication.class, args);
	}

}
