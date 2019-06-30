package service;


import model.UserAddress;

import java.util.List;

public interface AddressService {

    public List<UserAddress> getUserAddress(String userId);
}
