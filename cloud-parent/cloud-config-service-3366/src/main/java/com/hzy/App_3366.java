package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer         //启动cloudconfig服务
public class App_3366 {
	public static void main(String[] args) {
		SpringApplication.run(App_3366.class, args);
	}
}
