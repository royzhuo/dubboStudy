package com.boot.customer.bootcustomer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@SpringBootApplication
@ComponentScan(
		basePackages = {"com.boot.customer"}
)
public class BootcustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcustomerApplication.class, args);
	}

}
