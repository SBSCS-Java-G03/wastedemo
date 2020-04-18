package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.RubbishMapper;
import com.ishang.wastedemo.admin.entity.Rubbish;
import com.ishang.wastedemo.admin.service.RubbishService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("RubbishService")
public class RubbishServiceImpl implements RubbishService {

	@Autowired
	private RubbishMapper dao;
	
	@Override
	public int save(Rubbish record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int delete(Rubbish record) {
		// TODO Auto-generated method stub
		record.setDelFlag(0);
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public int delete(List<Rubbish> records) {
		// TODO Auto-generated method stub
		for(Rubbish r : records) 
			delete(r);
		return 0;
	}

	@Override
	public Rubbish findById(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rubbish> selectbytype(int typeid) {
		// TODO Auto-generated method stub
		return dao.selectbytype(typeid);
	}

}
