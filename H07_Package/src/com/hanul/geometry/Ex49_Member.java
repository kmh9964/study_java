package com.hanul.geometry;

public class Ex49_Member {

	//회원 정보: 이름, 아이디, 패스워드, 폰번호, 나이
	//오버로딩:이름은 같은데 파라미터가 다른것
	//폰번호 변경, 패스워드 변경, 나이변경 매소드 만들것
	
	public String name, id, pW, phoneNo;
	public int age;
	
	//회원 정보를 처음 생성할때 이름, 아이디, 패스워드는 무조건 입력
	public Ex49_Member(String name, String id, String pW){
		this.name = name;
		this.id = id;
		this.pW = pW;
		
	}
	//나머지 정보는 있으면 입력받을 수 있게 하시오.-4가지
	public Ex49_Member(String name, String id, String pW, String phoneNo){
		this.name = name;//this(name,age,pW); 이렇게 세개를 묶어줘도 된다
		this.id = id;
		this.pW = pW;
		this.phoneNo = phoneNo;
	}//5가지
	public Ex49_Member(String name, String id, String pW, String phoneNo, int age){
		this.name = name;//this(name,age,pW); 이렇게 세개를 묶어줘도 된다
		this.id = id;	 //	this는 같은 클래스에서 선언한 첫번째 생성자에서 쓴것을 받아다 쓴다는 뜻
		this.pW = pW;
		this.phoneNo = phoneNo;
		this.age = age;
		
	}
	 //폰번호 변경 매소드
		 public void changephoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
			
	// 패스워드 변경 매소드
		public void changePassWord(String passWord) {
			this.pW = passWord;
		}
	// 나이변경 매소드 
		public void changeAge(int age) {
			this.age = age;
		}
	
	
	
	
}
