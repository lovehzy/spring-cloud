package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard    //启用服务监控
public class App_9001 {
    public static void main(String[] args) {
        SpringApplication.run(App_9001.class,args);
    }
}
