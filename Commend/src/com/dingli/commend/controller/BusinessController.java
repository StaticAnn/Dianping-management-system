package com.dingli.commend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dingli.commend.bean.Business;
import com.dingli.commend.service.BusService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class BusinessController {
	
	@Autowired
	private BusService busService;
	
	@RequestMapping("/getBusList")
	public String getBusList(@RequestParam(value="pageIndex",defaultValue="1")Integer i,Model m){
		
		PageHelper.startPage(1, 3);
		
		List<Business> businessList=busService.getBusList();
		
		PageInfo pageInfo=new PageInfo(businessList);
		
		m.addAttribute("busPageList", pageInfo);
		
		return "content/businessList";
	
	}

}
