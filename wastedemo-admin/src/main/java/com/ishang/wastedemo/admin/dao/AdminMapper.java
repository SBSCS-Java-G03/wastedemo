package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.Admin;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
    
    /**
	 * admin的模糊查找 返回list
	 * todo: dao和xml自己写
	 * */
	List<Admin> findbyName(Admin record);
}