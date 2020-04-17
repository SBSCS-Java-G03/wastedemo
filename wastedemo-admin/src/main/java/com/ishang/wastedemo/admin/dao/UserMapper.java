package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(User record);

	User selectByPrimaryKey(Integer id);

	List<User> selectAll();

	int updateByPrimaryKey(User record);

	int deleteByPrimaryKey(String user);
	
	//--------------------
	

	List<User> findbyname(User record);
	
}