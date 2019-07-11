package com.dubbo.springboot.provide.bootprovide;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo //开启基于注解的dubbo功能
@SpringBootApplication
//@ComponentScan(
//		basePackages = {"com.dubbo"}
//)
public class BootprovideApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootprovideApplication.class, args);
	}

}
