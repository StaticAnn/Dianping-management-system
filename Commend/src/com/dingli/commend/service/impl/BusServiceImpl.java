package com.dingli.commend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingli.commend.bean.Business;
import com.dingli.commend.bean.BusinessDto;
import com.dingli.commend.dao.BusinessMapper;
import com.dingli.commend.service.BusService;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	private BusinessMapper bm;
	
	@Override
	public List<Business> getBusList() {
		
		List<Business> bus=bm.selectAllBus();
		return bus;
	}
	
//	@Override
//	public List<BusinessDto> getBusListForApi(BusinessDto dto){
//		
//		return null;
//		
//	}

}
