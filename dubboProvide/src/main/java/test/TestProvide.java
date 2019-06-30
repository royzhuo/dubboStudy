package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestProvide {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("provide.xml");
        ioc.start();
        System.in.read();
    }
}
