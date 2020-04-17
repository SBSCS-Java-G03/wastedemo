package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.IpAddress;
import java.util.List;

public interface IpAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IpAddress record);

    IpAddress selectByPrimaryKey(Integer id);

    List<IpAddress> selectAll();

    int updateByPrimaryKey(IpAddress record);
}