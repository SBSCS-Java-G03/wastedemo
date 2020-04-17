package com.ishang.wastedemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.wastedemo.admin.service.RecycleOrderDetailService;
import com.ishang.wastedemo.admin.service.RecycleOrderService;
import com.ishang.wastedemo.admin.service.RecycleSiteService;

@RestController
@RequestMapping("recycle")
public class RecycleController {
	
	@Autowired
	private RecycleOrderService orderservice;
	
	@Autowired
	private RecycleOrderDetailService detailservice;
	
	@Autowired
	private RecycleSiteService siteservice;
}
