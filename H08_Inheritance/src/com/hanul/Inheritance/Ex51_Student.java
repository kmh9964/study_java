package com.hanul.Inheritance;

public class Ex51_Student extends Ex53_People{
	//extends(상속한다) Ex53_People(상속하는 클래스명:부모클래스)의 것을 상속한다는 뜻
	//Ex51 과 Ex52의 공통점을 Ex53에 넣은 뒤 상속받아서 쓴다는 뜻
	
	//필드 : 학번, 이름, 나이==>Ex52 클래스의 회사원과 이름, 나이는 공통사항
	//매소드:먹는다, 잔다, 학교에 간다==>Ex52 클래스의 회사원과 먹는다. 잔다는 공통사항
	//여기 클래스에선 공통사항을 제한 나머지 부분만 적음
	
	String studentNo;
	
	public Ex51_Student(String name, int age, String studentNo) {
		super(name, age);
		this.studentNo = studentNo;
	}

	@Override
	void go() {
		System.out.println("학교를 갑니다.");
		
	}


//	public void gotoSchool() {
//		System.out.println(name + "등교한다.");
//	}


	
	
	
	
}
