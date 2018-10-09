package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.myrule.config.MyRule;

@SpringBootApplication
@EnableEurekaClient      //标识为eureka客户端
@RibbonClient(name="cloud-dept",configuration=MyRule.class)
public class App_80 {
	public static void main(String[] args) {
		SpringApplication.run(App_80.class, args);
	}
}
