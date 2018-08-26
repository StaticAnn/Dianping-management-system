package com.dingli.commend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dingli.commend.bean.mMember;
import com.dingli.commend.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping("/preLogin")
	public String preLogin(){
		
		return "system/login";
		
	}
	
	@RequestMapping("/checkLogin")
	public String checkLogin(Model s,mMember m){
		
		if(loginservice.checkLogin(m))
		{
			return "system/index";
		}else {
			return "system/login";
		}
				
	}

}
