package com.ishang.wastedemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.wastedemo.admin.service.RubbishService;
import com.ishang.wastedemo.admin.service.RubbishTypeService;

@RestController
@RequestMapping("rubbish")
public class RubbishController {

	@Autowired 
	private RubbishTypeService typeservice;
	
	@Autowired
	private RubbishService infoservice;
	
	/*
	 * 1垃圾类别管理
	 * 	1.1添加 1
	 * 	1.2删除
	 * 	1.3修改 1
	 * 	1.4查找所有
	 * 	1.5模糊查找
	 * 2垃圾信息管理	
	 * 	2.1添加 1
	 * 	2.2删除
	 * 	2.3修改
	 * 	2.4查找所有 1
	 * 	2.5模糊查找
	 * */
	
}
