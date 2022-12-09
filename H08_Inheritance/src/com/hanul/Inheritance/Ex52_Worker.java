package com.hanul.Inheritance;

public class Ex52_Worker extends Ex53_People{
	//extends Ex53_People(상속하는 클래스명:부모클래스)의 것을 상속한다는 뜻
	//Ex51 과 Ex52의 공통점을 Ex53에 넣은 뒤 상속받아서 쓴다는 뜻
	
	
	//필드: 사번, 이름, 나이==>Ex51 클래스의 학생과 이름, 나이는 공통사항
	//매소드: 먹는다, 잔다, 회사에 간다==>Ex51 클래스의 학생과 먹는다. 잔다는 공통사항
	//여기 클래스에선 공통사항을 제한 나머지 부분만 적음
	
	String workNo;
	
	public Ex52_Worker(String name, int age, String workNo) {
		super(name, age);
		this.workNo = workNo;
	}



	@Override
	void go() {
		System.out.println("회사에 출급합다.");
	}
	
	
	
	
	
	
	
	
}
