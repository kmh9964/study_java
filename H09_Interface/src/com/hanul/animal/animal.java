package com.hanul.animal;

public  abstract class animal {

	
	//동물
	//품종
	//매소드: 먹는다, 잠을잔다
	
	String kind;
	
	animal(String kind){
		this.kind = kind;
		System.out.println("동물의 품종 : "+ kind);
	}
	
	void eat() {
		System.out.println(kind + "가 먹는다.");
	}
	 
	void sleep() {
		System.out.println(kind + "가 잠을 잔다.");
	}
	 
	
	 
	
}
