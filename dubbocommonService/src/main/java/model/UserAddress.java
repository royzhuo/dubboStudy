package model;

import java.io.Serializable;

public class UserAddress implements Serializable {

    private String id;
    private String userId;
    private String userName;
    private String address;

    public UserAddress(String id, String userId, String userName, String address) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }

    public UserAddress() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
