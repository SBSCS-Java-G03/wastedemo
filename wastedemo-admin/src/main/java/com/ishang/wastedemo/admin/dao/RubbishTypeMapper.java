package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.RubbishType;
import java.util.List;

public interface RubbishTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RubbishType record);

    RubbishType selectByPrimaryKey(Integer id);

    List<RubbishType> selectAll();

    int updateByPrimaryKey(RubbishType record);
}