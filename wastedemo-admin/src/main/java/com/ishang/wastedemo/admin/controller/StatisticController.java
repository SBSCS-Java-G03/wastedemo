package com.ishang.wastedemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.wastedemo.admin.service.RubbishService;
import com.ishang.wastedemo.admin.service.UserTotalDataService;
import com.ishang.wastedemo.core.http.HttpResult;

@RestController
@RequestMapping("statistic")
public class StatisticController {

	@Autowired
	private RubbishService rubbishservice;
	
	@Autowired
	private UserTotalDataService dataservice;
	
	/* todo
	 * 1根据垃圾种类统计 select sum(number) from usertotaldata group by typeid
	 * 2下单数量业主排行 select count(*) from order group by userid
	 * 3回收垃圾总数业主排行 同2
	 * 4被回收垃圾的种类排行 select rubbishid,SUM(number) as sum from user_total_data WHERE rubbishtype=2 GROUP BY rubbishid ORDER BY sum
	 * 5被扔垃圾数量排行 select count(number) from usertotaldata group by rubbishid
	 * */
	
	//需要学习图表插件
}
