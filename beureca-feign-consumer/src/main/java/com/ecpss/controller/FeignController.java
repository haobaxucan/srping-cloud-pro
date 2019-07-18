package com.ecpss.controller;

import com.ecpss.service.FeignTicketSerivceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xc on 2019/7/18.
 */
@RestController
public class FeignController {
    
    @Autowired
    private FeignTicketSerivceDemo demo;
    @RequestMapping("/ticket")
    public String getTicket(){
        return demo.getTicket();
    }
    @RequestMapping("/test")
    public String getTest(){
        return demo.getTest();
    }
    
}
