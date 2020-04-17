package com.ishang.wastedemo.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.entity.Admin;
import com.ishang.wastedemo.core.service.CurdService;

@Service
public interface AdminService extends CurdService<Admin> {

	/**
	 * 查找所有的admin
	 * selectAll
	 *  实际应用时应选择分页插件
	 * */
	List<Admin> findAll();
	
	/**
	 * 修改现在登录的admin的信息
	 * updateByPrimaryKey
	 * */
	int updateAdmin(Admin record);
	
	/**
	 * admin的模糊查找 返回list
	 * todo: dao和xml自己写
	 * */
	List<Admin> findAdmin(Admin record);

}
