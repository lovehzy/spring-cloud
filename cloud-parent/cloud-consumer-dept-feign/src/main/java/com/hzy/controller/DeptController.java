package com.hzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hzy.pojo.Dept;
import com.hzy.service.DeptService;
 
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.GET)
	public boolean add(Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/consumer/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@RequestMapping(value = "/consumer/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}

}
