package com.boot.customer.serviceImpl;


import com.alibaba.dubbo.config.annotation.Reference;
import model.UserAddress;
import org.springframework.stereotype.Service;
import service.AddressService;
import service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Reference
    AddressService addressService;

    @Override
    public List<UserAddress> getUserAddress() {
        List<UserAddress> userAddresses=addressService.getUserAddress("10010");
        System.out.println(userAddresses);
        return userAddresses;
    }
}
