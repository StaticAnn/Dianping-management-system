package com.dingli.commend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommentController {
	
	
	@RequestMapping("/showComment")
	public String showComment(){
		
		return "content/CommentList";
		
	}

}
