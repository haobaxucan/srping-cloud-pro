package com.ecpss.service.impl;

import com.ecpss.service.FeignTicketSerivce;
import org.springframework.stereotype.Service;

/**
 * Created by xc on 2019/7/18.
 */

@Service
public class TicketSerivceImpl implements FeignTicketSerivce {

    @Override
    public String getTicket() {
        return "xc";
    }

    @Override
    public String getTest() {
        return "can";
    }
}
