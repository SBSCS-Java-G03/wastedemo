package com.ishang.wastedemo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.wastedemo.admin.entity.PointQuestion;
import com.ishang.wastedemo.admin.service.PointQuestionService;
import com.ishang.wastedemo.core.http.HttpResult;

@RestController
@RequestMapping("user/question")
public class UserQuestionController {

	@Autowired
	private PointQuestionService service;
	
	/* todo
	 * 1问题广场 1
	 * 2查找问题
	 * 3user提问 1
	 * */
	
	@PostMapping(value = "/findAll")
	public HttpResult qufindall() {
		return HttpResult.ok(service.findall());
	}
	
	//@PostMapping(value = "/findList")
	//todo: 查找问题
	
	@PostMapping(value = "/insert")
	public HttpResult quadd(PointQuestion record) {
		if(record.getUserid()==null) return HttpResult.error("no userid");
		else if(record.getText()==null) return HttpResult.error("Input your question.");
		else return HttpResult.ok(service.save(record));
	}
}
