package com.dingli.commend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingli.commend.bean.mMember;
import com.dingli.commend.dao.mMemberMapper;
import com.dingli.commend.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private mMemberMapper memberDao;

	@Override
	public boolean checkLogin(mMember m) {
		
		List<mMember> members=memberDao.selectByMember(m);
		
		// TODO Auto-generated method stub
		return members.size()>0?true:false;
	}

}
