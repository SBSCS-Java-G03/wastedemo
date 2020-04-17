package com.ishang.wastedemo.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.dao.UserMapper;
import com.ishang.wastedemo.admin.entity.User;
import com.ishang.wastedemo.admin.service.UserService;
import com.ishang.wastedemo.core.page.PageRequest;
import com.ishang.wastedemo.core.page.PageResult;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper dao;
	
	@Override
	public int save(User record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int delete(User record) {
		// TODO Auto-generated method stub
		record.setDelFlag(0);
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public int delete(List<User> records) {
		// TODO Auto-generated method stub
		if (records != null && records.size() > 0) {
			for (User u : records) delete(u);
			return 0;
		}else return 1;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public int updateUser(User record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

	@Override
	public List<User> findUser(User record) {
		// TODO Auto-generated method stub
		return dao.findbyname(record);
	}

}
