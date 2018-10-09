package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //启动eureka服务，使得其它微服务注册进来
public class App_7002 {
	public static void main(String[] args) {
		SpringApplication.run(App_7002.class, args);
	}
}
