package com.ecpss.controller;

import com.ecpss.service.TicketSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xc on 2019/7/17.
 */
@RestController
public class TicketController {
    @Autowired
    TicketSerivce ticketSerivce;
    
    @GetMapping("/ticket")
    public String getTicket() {
        return ticketSerivce.getTicket();
    }
    
    
}
