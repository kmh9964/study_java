package com.hanul.absta;

public class Ex66_chicken extends Ex63_animal2 {
	
	//닭
	//매소드: 먹는다, 잠을잔다, 꼬끼오 운다.
	
	
	Ex66_chicken(String kind) {//생성자는 부모클래스에서 선언한 뒤 자식클래스에서 이렇게 받아줘야된다
		super(kind);
	}
	
	
//	void cry() {
//		System.out.println(kind + "가 꼬끼오 운다.");
//	}


	@Override
	void sound() {
		System.out.println(kind + "가 꼬끼오 운다.");
		
	}
	
}

	
	
