package com.ecpss.controller;

import com.ecpss.service.FeignTicketSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xc on 2019/7/18.
 */
@RestController
public class FeignController {
    
    @Autowired
    private FeignTicketSerivce demo;
    @RequestMapping("/get")
    public String getTicket(){

        return demo.getTicket();
    }

    
}
