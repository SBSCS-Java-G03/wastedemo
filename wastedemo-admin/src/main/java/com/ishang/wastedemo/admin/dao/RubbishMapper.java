package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.Rubbish;
import java.util.List;

public interface RubbishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rubbish record);

    Rubbish selectByPrimaryKey(Integer id);

    List<Rubbish> selectAll();

    int updateByPrimaryKey(Rubbish record);
}