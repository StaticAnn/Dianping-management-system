package com.dingli.commend.service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.dingli.commend.bean.Advance;
import com.dingli.commend.bean.AdvanceDto;


public interface AdService {
	
	public List<Advance> getAdList();
	
	public boolean saveAd(AdvanceDto adDto);
	
	public AdvanceDto getAdById(Advance ad);
	
	public List<AdvanceDto> getAdListForApi();
	
//	public int deleteAd(Advance ad,Model m);
	public String deleteAd(int id);
	
	public List<Advance> chaxunAd(Advance ad);

}
