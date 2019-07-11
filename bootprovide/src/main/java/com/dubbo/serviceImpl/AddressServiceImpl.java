package com.dubbo.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import model.UserAddress;
import org.springframework.stereotype.Component;
import service.AddressService;

import java.util.Arrays;
import java.util.List;

@Service  //暴露服务
@Component
public class AddressServiceImpl implements AddressService {

    public AddressServiceImpl() {
        System.out.println("------------------");
    }

    @Override
    public List<UserAddress> getUserAddress(String userId) {
        UserAddress userAddress1=new UserAddress("1","10010","roy","中国福建省厦门市");
        UserAddress userAddress2=new UserAddress("2","10011","jessica","中国福建省厦门市思明区");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
