package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.PointQuestionMapper;
import com.ishang.wastedemo.admin.entity.PointQuestion;
import com.ishang.wastedemo.admin.service.PointQuestionService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service
public class PointQuestionServiceImpl implements PointQuestionService {
	
	@Autowired
	private PointQuestionMapper dao;

	@Override
	public int save(PointQuestion record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int delete(PointQuestion record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(List<PointQuestion> records) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PointQuestion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PointQuestion> findall() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
