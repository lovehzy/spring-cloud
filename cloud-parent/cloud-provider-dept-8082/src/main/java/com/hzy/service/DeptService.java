package com.hzy.service;

import java.util.List;

import com.hzy.pojo.Dept;

public interface DeptService {
	boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}
