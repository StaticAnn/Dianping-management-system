package com.dingli.commend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dingli.commend.bean.AdvanceDto;
import com.dingli.commend.bean.BusinessDto;
import com.dingli.commend.bean.BusinessDtoForApi;
import com.dingli.commend.service.AdService;
import com.dingli.commend.service.BusService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class ApiController {
	
	@Autowired
	private AdService adService;
	
	//首页广告数据接口
	@RequestMapping("/api/homead")
	public List<AdvanceDto> getAllAdForApi(){
		
		PageHelper.startPage(1, 6);
		List<AdvanceDto> dtos=adService.getAdListForApi();
		PageInfo pageInfo=new PageInfo(dtos);
		return pageInfo.getList();
		
	}
	
	//猜你喜欢（首页商户推荐）
	@RequestMapping("/api/homelist/{city}/{page}")
	public BusinessDtoForApi getBusLoveDto(BusinessDto dto){
//	public BusinessDtoForApi getBusLoveDto(@PathVariable(value="city") String city){
		
		dto.setPage(dto.getPage()+1);
		PageHelper.startPage(dto.getPage(),5);
		List<BusinessDto> busList=BusService.getBusListForApi(dto);
		
		PageInfo pg=new PageInfo(busList);
		BusinessDtoForApi dtoForApi=new BusinessDtoForApi();
		dtoForApi.setHadMore(!pg.isIsLastPage());
//		dtoForApi.setDate;
		
		return null;	
		
	}
	
}
