package com.ishang.wastedemo.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.entity.Rubbish;
import com.ishang.wastedemo.core.service.CurdService;

@Service
public interface RubbishService extends CurdService<Rubbish> {

	List<Rubbish> selectbytype(int i);

}
