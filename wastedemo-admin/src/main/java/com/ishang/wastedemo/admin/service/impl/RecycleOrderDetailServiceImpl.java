package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.RecycleOrderDetailMapper;
import com.ishang.wastedemo.admin.entity.RecycleOrderDetail;
import com.ishang.wastedemo.admin.service.RecycleOrderDetailService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("RecycleOrderDetailService")
public class RecycleOrderDetailServiceImpl implements RecycleOrderDetailService {
	
	@Autowired
	private RecycleOrderDetailMapper dao;

	@Override
	public int save(RecycleOrderDetail record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int delete(RecycleOrderDetail record) {
		// TODO Auto-generated method stub
		record.setDelFlag(0);
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public int delete(List<RecycleOrderDetail> records) {
		// TODO Auto-generated method stub
		for(RecycleOrderDetail d : records) delete(d);
		return 0;
	}

	@Override
	public RecycleOrderDetail findById(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
