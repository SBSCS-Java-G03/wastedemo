package com.ishang.wastedemo.admin.dao;

import com.ishang.wastedemo.admin.entity.PointQuestion;
import java.util.List;

public interface PointQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PointQuestion record);

    PointQuestion selectByPrimaryKey(Integer id);

    List<PointQuestion> selectAll();

    int updateByPrimaryKey(PointQuestion record);
}