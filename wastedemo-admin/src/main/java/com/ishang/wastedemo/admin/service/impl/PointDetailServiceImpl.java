package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.PointDetailMapper;
import com.ishang.wastedemo.admin.entity.PointDetail;
import com.ishang.wastedemo.admin.service.PointDetailService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("PointDetailService")
public class PointDetailServiceImpl implements PointDetailService {
	
	@Autowired
	private PointDetailMapper detaildao;

	@Override
	public int save(PointDetail record) {
		// TODO Auto-generated method stub
		return detaildao.insert(record);
	}

	@Override
	public int delete(PointDetail record) {
		// TODO Auto-generated method stub
		//不允许删除
		return 0;
	}

	@Override
	public int delete(List<PointDetail> records) {
		// TODO Auto-generated method stub
		//不允许删除
		return 0;
	}

	@Override
	public PointDetail findById(Long id) {
		// TODO Auto-generated method stub
		return detaildao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PointDetail> findall() {
		// TODO Auto-generated method stub
		return detaildao.selectAll();
	}

}
