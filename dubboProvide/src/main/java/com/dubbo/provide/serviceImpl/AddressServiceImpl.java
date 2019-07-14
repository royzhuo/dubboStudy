package com.dubbo.provide.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import model.UserAddress;
import org.springframework.stereotype.Component;
import service.AddressService;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class AddressServiceImpl implements AddressService {

    @Override
    public List<UserAddress> getUserAddress(String userId) {
        System.out.println("AddressServiceImpl.......1......");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserAddress userAddress1=new UserAddress("1","10010","roy","中国福建省厦门市");
        UserAddress userAddress2=new UserAddress("2","10011","jessica","中国福建省厦门市思明区");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
