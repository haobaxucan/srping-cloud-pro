package com.ecpss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 五大神兽
 服务发现——Netflix Eureka
 
 客服端负载均衡——Netflix Ribbon
 
 断路器——Netflix Hystrix
 
 服务网关——Netflix Zuul
 
 分布式配置——Spring Cloud Config
 */
@SpringBootApplication
@EnableZuulProxy
public class CeurecaZuulApplication {
	/**
	 * 启eureca集群
	 * 启动 beureca-provider
	 * 不用路由 http://localhost:8082/ticket
	 * 带上路由：
	 *http://zuulxc.com:9527/provider-ticket/ticket
	 * ------
	 * zuulxc.com  映射地址
	 * provider-ticket  服务提供者的微服务名
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 配置文件配置文件映射后访问
		 * http://zuulxc.com:9527/xc/ticket
		 *---还可以设置前缀
		 *zuul.prefix=chaoshen
		 * http://zuulxc.com:9527/chaoshen/xc/ticket
		 */
		SpringApplication.run(CeurecaZuulApplication.class, args);
	}

}
