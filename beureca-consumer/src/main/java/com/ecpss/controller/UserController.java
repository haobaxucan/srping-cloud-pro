package com.ecpss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.soap.Name;

/**
 * Created by xc on 2019/7/17.
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/buy")
    public String buyTicket( String name){
//使用http 加上 服务提供者暴露的实例名称 加上 配置请求/ticket
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket",
                String.class);//传入什么类型返回什么类型
        return name+"购买了"+"  "+s;
    }
    
}
