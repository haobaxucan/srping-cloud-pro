package com.ecpss.service.impl;

import com.ecpss.service.FeignTicketSerivceDemo;
import org.springframework.stereotype.Component;

/**
 * Created by xc on 2019/7/18.
 */
@Component
public class DemoServiceFallback implements FeignTicketSerivceDemo{
    @Override
    public String getTicket() {
        return "error";
    }
    
    @Override
    public String getTest() {
        return "test";
    }
}
