package com.ishang.wastedemo.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.entity.PointQuestion;
import com.ishang.wastedemo.core.service.CurdService;


@Service("PointQuestionService")
public interface PointQuestionService extends CurdService<PointQuestion> {

	List<PointQuestion> findall();

}
