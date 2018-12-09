package com.onDiet.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.onDiet.mapper.memberMapper;
import com.onDiet.service.memberService;
import com.onDiet.vo.Member;

public class memberDao implements memberService{

	@Autowired
	memberMapper mapper;
	
	@Override
	public Boolean isDoubleId(String id) {
		Member m = mapper.findMemberById(id);
		if(m!=null) return true;
		return false;
	}

	@Override
	public String login(String id, String pass) {
		Member m = mapper.findMemberById(id);
		if(m!=null) {
			if(m.getPass().equals(pass))return "sucess";
			else return "wrong password";
		}
		return "no user";
	}

	@Override
	public void signIn(Member m) {
		mapper.siginIn(m);
	}

	@Override
	public void siginOut(String id) {
		mapper.siginOut(id);
	}

}
