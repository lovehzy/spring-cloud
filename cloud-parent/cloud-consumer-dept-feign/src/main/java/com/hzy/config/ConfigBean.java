package com.hzy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced   //开启负载均衡
	public RestTemplate getRestTemaplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public IRule getRule() {
		return new RandomRule();    //设置为随机算法，如果不设置将使用默认的轮播算法
	}*/
}
