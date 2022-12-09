package com.hanul.shape;

abstract public class Shape {
	//abstract가 있는 추상클래스 상속 받으면 객체 형성 못함
	//무조건 상속 받아야된다.
	
	//필드 : 높이
	//매소드: 넓이를 구한다
	int high;
	
	public Shape(int high){
		this.high = high;
	}
	
	abstract void getArea();//public은 생략 가능
	
	abstract double getArea1();//{}는 없음
	
	
	
	
}
