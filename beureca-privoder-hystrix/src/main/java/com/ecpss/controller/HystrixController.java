package com.ecpss.controller;

import com.ecpss.service.TicketSerivce;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xc on 2019/7/17.
 */
@RestController
public class HystrixController {
    @Autowired
    TicketSerivce ticketSerivce;
    
    @GetMapping("/ticket")
    @HystrixCommand(fallbackMethod ="aa")
    public String getTicket() {
        try {
            int i=10/0;
        } catch (Exception e) {
           throw  new RuntimeException(e.getMessage());
        }
        return ticketSerivce.getTicket();
    }
    
    public String aa(){
        return "特殊数字";
    }
}
