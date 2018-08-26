package com.dingli.commend.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dingli.commend.bean.Advance;
import com.dingli.commend.dao.AdvanceMapper;
import com.dingli.commend.service.AdService;
import com.dingli.commend.dao.AdvanceMapper;
import com.dingli.commend.bean.AdvanceDto;

@Service
public class AdServiceImpl implements AdService{
	
	@Value("${img_save_path}")
	private String filePath;
	
	@Value("${img_url}")
	private String imgUrl;
	
	@Autowired
	private AdvanceMapper am;
	
	@Override
	public List<Advance> getAdList(){
		
		List<Advance> ads=am.selectAllAd();
		return ads;
		
	}

	@Override
	public boolean saveAd(AdvanceDto adDto) {
		
		Advance ad=new Advance();
		
		MultipartFile imgFile=adDto.getImgFile();
		
		String fileName=System.currentTimeMillis()+""+imgFile.getOriginalFilename();
		
//		if(null==imgFile||imgFile.getSize()==0)
//		{
//			return false;
//		}
		
		File saveFile=new File(filePath+fileName);
		
		if(!saveFile.exists())
		{
			saveFile.mkdirs();
		}
		
		try {
			imgFile.transferTo(saveFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		BeanUtils.copyProperties(adDto, ad);
		
		ad.setImgFileName(imgFile.getOriginalFilename());
		
		am.insert(ad);
		
		return true;
	}

	@Override
	public AdvanceDto getAdById(Advance ad) {
		
		Advance adv=am.selectByPrimaryKey(ad.getId());
		AdvanceDto adDto=new AdvanceDto();
		BeanUtils.copyProperties(adv, adDto);
		
		adDto.setImageurl(imgUrl+adv.getImgFileName());
	
		return adDto;
		
	}

	@Override
	public List<AdvanceDto> getAdListForApi() {
		
		List<Advance> ads=am.selectAllAd();
		
		List<AdvanceDto> adDtos=new ArrayList<AdvanceDto>();
		
		AdvanceDto dto=new AdvanceDto();
		
		for(int i=0;i<ads.size();i++)
		{
			BeanUtils.copyProperties(ads.get(i), dto);
			
			dto.setImg(imgUrl+ads.get(i).getImgFileName());
		}
		
		return null;
	}
	
//	@Override
//	public int deleteAd(Advance ad,Model m){
//		
//		
//		return 0;
//		
//	}
	@Override
	public String deleteAd(int id){
		
//		System.out.println("zhiqian");
		am.deleteByPrimaryKey(id);
//		System.out.println("success!");
		return null;
		
	}
	
	@Override
	public List<Advance> chaxunAd(Advance ad){
		
		String s=ad.getTitle();
		List<Advance> ads=am.chaxunAd(s);
		
		return ads;
		
	}

}
