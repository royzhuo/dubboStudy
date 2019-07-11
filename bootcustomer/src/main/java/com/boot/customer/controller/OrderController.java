package com.boot.customer.controller;

import model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrderService;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getUserAddress")
    @ResponseBody
    public List<UserAddress> getUserAddress(){
        return orderService.getUserAddress();
    }
}
