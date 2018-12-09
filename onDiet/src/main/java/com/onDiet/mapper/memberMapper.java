package com.onDiet.mapper;

import com.onDiet.vo.Member;

public interface memberMapper {
	public Member findMemberById(String id);
	public void siginIn(Member m);
	public void siginOut(String id);
}
