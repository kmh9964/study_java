package com.hanul.object;

public class Ex38_Member {

	//회원 정보: 이름, 아이디, 패스워드, 폰번호, 나이
	//회원 정보를 처음 생성할때 이름, 아이디, 패스워드는 무조건 입력
	//나머지 정보는 있으면 입력받을 수 있게 하시오.
	String name, id, pW, poneNo;
	int age;
	
	Ex38_Member(String name, String id, String pW){
		this.name = name;
		this.id = id;
		this.pW = pW;
		
	}
	Ex38_Member(String name, String id, String pW, String poneNo, int age){
		this.name = name;
		this.id = id;
		this.pW = pW;
		this.poneNo =poneNo;
		this.age = age;
		
	}
		
			
		
	
	
	
	
	
	
	
}
