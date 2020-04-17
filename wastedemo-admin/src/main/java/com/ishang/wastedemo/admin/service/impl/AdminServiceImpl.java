package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.AdminMapper;
import com.ishang.wastedemo.admin.entity.Admin;
import com.ishang.wastedemo.admin.service.AdminService;
import com.ishang.wastedemo.core.page.MybatisPageHelper;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper admindao;
	
	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return admindao.selectAll();
	}
	
	@Override
	public int save(Admin record) {
		// TODO Auto-generated method stub
		return admindao.insert(record);
	}

	@Override
	public int delete(Admin record) {
		// TODO Auto-generated method stub
		record.setDelFlag(0);
		return admindao.updateByPrimaryKey(record);
	}

	@Override
	public int delete(List<Admin> records) {
		// TODO Auto-generated method stub
		if (records != null && records.size() > 0) {
			for (Admin admin : records) {
				delete(admin);
			}
		}else return 0;
		return 1;
	}

	@Override
	public Admin findById(Long id) {
		// TODO Auto-generated method stub
		return admindao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		PageResult pageResult = null;
		pageResult = MybatisPageHelper.findPage(pageRequest, admindao);
		//没做完
		return null;
	}

	@Override
	public List<Admin> findAdmin(Admin record) {
		// TODO Auto-generated method stub
		return admindao.findbyName(record);
	}

	@Override
	public int updateAdmin(Admin record) {
		// TODO Auto-generated method stub
		return admindao.updateByPrimaryKey(record);
	}

}
