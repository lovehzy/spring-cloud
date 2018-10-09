package com.myrule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myrule.RoudRobinRule_hzy;
import com.netflix.loadbalancer.IRule;

@Configuration
public class MyRule {
	
	@Bean
	public IRule getRule() {
		return new RoudRobinRule_hzy();
	}
}
