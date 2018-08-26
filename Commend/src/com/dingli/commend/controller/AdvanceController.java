package com.dingli.commend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dingli.commend.bean.Advance;
import com.dingli.commend.bean.AdvanceDto;
import com.dingli.commend.service.AdService;
import com.dingli.commend.service.LoginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class AdvanceController {
	
	@Autowired
	private AdService adService;
	
	@RequestMapping("/getAdList")
	public String getAdList(@RequestParam(value="pageIndex",defaultValue="1") Integer i,Model m){
		
//		PageHelper.startPage(1, 3);
		
		List<Advance> adList=adService.getAdList();
		
//		PageInfo pageInfo=new PageInfo(adList);
		
//		pageInfo.getList();
//		pageInfo.isHasNextPage();
//		pageInfo.getPageNum();
		
		m.addAttribute("adPageList", adList);
//		pageInfo.getNextPage();

		return "content/adList";
		
	}
	
	@RequestMapping("/adAdd")
	public String addAd(){
		
		return "content/adAdd";
				
	}
	
	@RequestMapping("/saveAd")
	public String saveAd(AdvanceDto adDto){
		System.out.println(123);
		adService.saveAd(adDto);
		
		return "content/adList";
		
	}
	
	@RequestMapping("/adModify")
	public String adModify(Advance ad,Model m){
		
		Advance newAd=adService.getAdById(ad);
		m.addAttribute("ad", newAd);
		return "content/adModify";
			
	}
	
	@RequestMapping("/deleteAd")
	public String deleteAd(@RequestParam int id){
		
//		System.out.println(id);
		adService.deleteAd(id);
		return "redirect:getAdList";
			
	}
	
	@RequestMapping("/chaxunAd")
	public String chaxunAd(Advance ad,Model m){
		
		List<Advance> adList = adService.chaxunAd(ad);
		m.addAttribute("adPageList", adList);
		
		return "content/adList";
		
	}

}
