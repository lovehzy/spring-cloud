package com.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy          //启用路由代理
public class App_9527 {
    public static void main(String[] args) {
        SpringApplication.run(App_9527.class,args);
    }
}
