package com.onDiet.service;

import com.onDiet.vo.Member;

public interface memberService {
	public Boolean isDoubleId(String id);
	public String login(String id, String pass);
	public void signIn(Member m);
	public void siginOut(String id);
}
