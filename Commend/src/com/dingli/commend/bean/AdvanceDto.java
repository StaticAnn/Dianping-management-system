package com.dingli.commend.bean;

import org.springframework.web.multipart.MultipartFile;

public class AdvanceDto extends Advance {
	
	private MultipartFile imgFile;
	
	private String imageurl;

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}

	public void setImg(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
