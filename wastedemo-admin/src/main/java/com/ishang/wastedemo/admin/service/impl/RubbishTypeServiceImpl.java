package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.RubbishTypeMapper;
import com.ishang.wastedemo.admin.entity.RubbishType;
import com.ishang.wastedemo.admin.service.RubbishTypeService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("RubbishTypeService")
public class RubbishTypeServiceImpl implements RubbishTypeService {

	@Autowired
	private RubbishTypeMapper dao;
	
	@Override
	public int save(RubbishType record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int delete(RubbishType record) {
		// TODO Auto-generated method stub
		record.setDelFlag(0);
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public int delete(List<RubbishType> records) {
		// TODO Auto-generated method stub
		for(RubbishType t: records) delete(t);
		return 0;
	}

	@Override
	public RubbishType findById(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RubbishType> findall() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
