package com.ishang.wastedemo.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ishang.wastedemo.admin.entity.PointDetail;
import com.ishang.wastedemo.core.service.CurdService;

@Service
public interface PointDetailService extends CurdService<PointDetail> {

	List<PointDetail> findall();

}
