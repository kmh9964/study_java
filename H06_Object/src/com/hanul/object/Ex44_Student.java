package com.hanul.object;

public class Ex44_Student {

	//학생 정보 관리 클래스 : 학번이 자동으로 부여되는 학생 정보를 관리한다.
	static int seqId = 220000;//학번 부여 변수.. 어느곳에 가도 하나만 된다
	int id;//학생에게 부여된 학번
	String name, phoneNo;
	
	//이름만 있는 생성자
	public Ex44_Student(String name) {
		this.id = ++seqId;
		this.name = name;
		
	
		
	}
	//이름, 폰번호 생성자
	public Ex44_Student(String name, String phoneNo) {
		this.id = ++seqId;
		this.name = name;//this(name); 으로 해줘도 된다
		this.phoneNo = phoneNo;
		
	}
	
}
