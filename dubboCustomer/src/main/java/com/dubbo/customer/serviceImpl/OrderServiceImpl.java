package com.dubbo.customer.serviceImpl;


import model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AddressService;
import service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    AddressService addressService;

    @Override
    public List<UserAddress> getUserAddress() {
        List<UserAddress> userAddresses=addressService.getUserAddress("10010");
        System.out.println(userAddresses);
        return userAddresses;
    }
}
