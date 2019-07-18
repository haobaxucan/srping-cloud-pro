package com.ecpss.service.impl;

import com.ecpss.service.TicketSerivce;
import org.springframework.stereotype.Service;

/**
 * Created by xc on 2019/7/18.
 */

@Service
public class TicketSerivceImpl implements TicketSerivce {
    
    @Override
    public String getTicket() {
        return "<超神的捷周>";
    }
}
