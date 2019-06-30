package com.dubbo.customer.serviceImpl;


import model.UserAddress;
import service.AddressService;
import service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    AddressService addressService;

    @Override
    public List<UserAddress> getUserAddress() {
        List<UserAddress> userAddresses=addressService.getUserAddress("10010");
        System.out.println(userAddresses);
        return userAddresses;
    }
}
