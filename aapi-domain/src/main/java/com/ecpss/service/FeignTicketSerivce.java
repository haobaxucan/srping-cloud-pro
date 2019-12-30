package com.ecpss.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xc on 2019/7/17.
 */
public interface FeignTicketSerivce {
    @RequestMapping(value = "/ticket",method = RequestMethod.GET)
    public String getTicket();

    @RequestMapping(value = "/test")
    public String getTest();
    
}
