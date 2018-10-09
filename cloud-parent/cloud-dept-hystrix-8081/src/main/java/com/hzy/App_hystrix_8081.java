package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient       //启动eureka客户端
@EnableDiscoveryClient    //启用eureka服务发现
@EnableCircuitBreaker     //对Hystrix熔断机制的支持
public class App_hystrix_8081 {
	public static void main(String[] args) {
		SpringApplication.run(App_hystrix_8081.class, args);
	}
}
