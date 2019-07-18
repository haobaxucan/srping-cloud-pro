package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BeurecaFeignProviderApplication {
	/**
	 * 服务端只是普通的实现---与feign 几乎无关
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		SpringApplication.run(BeurecaFeignProviderApplication.class, args);
	}

}
