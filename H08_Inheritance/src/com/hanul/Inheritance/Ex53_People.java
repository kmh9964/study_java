package com.hanul.Inheritance;

 public abstract class Ex53_People {//abstract 추상클래스가 됨
	
	//Ex51과 Ex52의 부모 클래스다
	//Ex51과 Ex52의 공통사항만 넣어줌
	
	String name;
	int age;
	
	
	public Ex53_People(String name, int age) {
		this.name = name;
		this.age = age;
	
	}

	public void eat() {//public 쓴 이유는 여기 저기서 쓸수 있게 써줌
		System.out.println(name + "먹는다.");
	}
	
	public void sleep() {
		System.out.println(name + "잠잔다.");
	}
	
	abstract void go(); //abstract가 붙어서 추상 매소드임
		
	
	
	
	
	
	
	
	
}
