package com.dingli.commend.service;

import java.util.List;

import com.dingli.commend.bean.Business;
import com.dingli.commend.bean.BusinessDto;

public interface BusService {
	
	public List<Business> getBusList();

	public static List<BusinessDto> getBusListForApi(BusinessDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
