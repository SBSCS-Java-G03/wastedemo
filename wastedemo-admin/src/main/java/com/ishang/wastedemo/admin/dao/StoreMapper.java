package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.Store;
import java.util.List;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer id);

	int insert(Store record);

	Store selectByPrimaryKey(Integer id);

	List<Store> selectAll();

	int updateByPrimaryKey(Store record);

}