package com.ecpss.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xc on 2019/7/17.
 */
@Configuration
public class RestConfig {
    /**
     * ribbon配置
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
    @Bean
    public IRule myRule(){
        // 用随机算法代替默认的轮询算法
        return new RandomRule();
        
        // 重试算法
//        return new RetryRule();//加入有个服务宕机，指挥访问三次，之后就不会访问宕机的服务了
    }
}
