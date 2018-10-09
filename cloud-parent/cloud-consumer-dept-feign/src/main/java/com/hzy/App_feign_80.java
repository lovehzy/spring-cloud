package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient      //标识为eureka客户端
@EnableFeignClients(basePackages = {"com.hzy"})
@ComponentScan("com.hzy")
public class App_feign_80 {
	public static void main(String[] args) {
		SpringApplication.run(App_feign_80.class, args);
	}
}
