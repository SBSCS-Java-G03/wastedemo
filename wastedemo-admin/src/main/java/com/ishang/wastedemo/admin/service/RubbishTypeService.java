package com.ishang.wastedemo.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.entity.RubbishType;
import com.ishang.wastedemo.core.service.CurdService;

@Service
public interface RubbishTypeService extends CurdService<RubbishType> {

	List<RubbishType> findall();

}
