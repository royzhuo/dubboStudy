package com.dubbo.customer.sub;

import model.UserAddress;
import org.springframework.util.StringUtils;
import service.AddressService;

import java.util.List;

public class AddressServiceSub implements AddressService{

    private final AddressService addressService;

    //构造函数无需自己传参数，dubbo会自动注入
    public AddressServiceSub(AddressService addressService) {
        super();
        this.addressService = addressService;
    }



    @Override
    public List<UserAddress> getUserAddress(String userId) {
        if (!StringUtils.isEmpty(userId)){
            //调用真正的接口
            return addressService.getUserAddress(userId);
        }
        return null;
    }
}
