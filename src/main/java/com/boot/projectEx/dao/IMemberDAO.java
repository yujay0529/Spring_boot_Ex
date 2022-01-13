package com.boot.projectEx.dao;

import java.util.HashMap;

import com.boot.projectEx.model.MemberVO;

public interface IMemberDAO {
	MemberVO loginCheck(HashMap<String, Object> map);//로그인
	String memIdCheck(String memId); //아이디 중복체크
	
}
