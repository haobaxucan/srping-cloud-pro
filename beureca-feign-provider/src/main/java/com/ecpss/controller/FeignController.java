package com.ecpss.controller;

import com.ecpss.service.TicketSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xc on 2019/7/18.
 */
@RestController
public class FeignController {
    /**
     * 这里是关键代码
     * url 和消费端接口的url相等，所以消费端controller和接口的url也相等
     * 所以这里三个url是相等的
     * 这段代码注释后，服务就无法调用
     */
    @Autowired
    private TicketSerivce ticketSerivce;
    @RequestMapping("/ticket")
    public String getTicket(){
        String ticket = ticketSerivce.getTicket();
        return ticket;
    }
}
