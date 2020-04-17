package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.UserTotalData;
import java.util.List;

public interface UserTotalDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTotalData record);

    UserTotalData selectByPrimaryKey(Integer id);

    List<UserTotalData> selectAll();

    int updateByPrimaryKey(UserTotalData record);
}