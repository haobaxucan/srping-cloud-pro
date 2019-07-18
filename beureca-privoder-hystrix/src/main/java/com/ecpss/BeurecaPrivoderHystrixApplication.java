package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class BeurecaPrivoderHystrixApplication {
	/**
	 * 服务熔断在服务端
	 * 服务降级在消费者端
	 * 观看使用熔断的时候 才运行
	 *
	 * 1 启动eureca 集群
	 * 2 启动主启动类
	 * 3 访问 http://localhost:8083/ticket
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(BeurecaPrivoderHystrixApplication.class, args);
	}

}
