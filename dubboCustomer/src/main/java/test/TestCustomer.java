package test;

import model.UserAddress;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;
import java.util.List;

public class TestCustomer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("cutomer.xml");
        System.out.println("0k ok ok");
        OrderService orderService= (OrderService) ioc.getBean(OrderService.class);
        List<UserAddress> userAddresses=orderService.getUserAddress();
        for (UserAddress userAddress:userAddresses){
            System.out.println(userAddress);
        }

        System.in.read();

    }
}
