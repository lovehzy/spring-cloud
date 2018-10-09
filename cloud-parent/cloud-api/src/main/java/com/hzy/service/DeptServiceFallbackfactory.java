package com.hzy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hzy.pojo.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptServiceFallbackfactory implements FallbackFactory<DeptService> {

	@Override
    public DeptService create(Throwable cause) {
		//创建一个接口的实例，进行返回
        return new DeptService(){

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID"+id+"没有对应的信息,Consumer客户端提供的降级信息,此服务Provider已经关闭")
                        .setDb_source("no this database in Mysql");
            }

            @Override
            public List<Dept> list() {
            	return new ArrayList<Dept>();
            }

            @Override
            public boolean add(Dept dept) {
            	return true;
            }
        };
    }
}
