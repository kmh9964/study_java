package com.hanul.interfac;

public class ShapeMain2 {

	public static void main(String[] args) {
		
		
		
		// Shape sh = new Shape(10);  ==> 부모클래스가 추상클래스여서 객체를 생성할 수 없다.
		// IShape ish = new IShape(); ==> 인터페이스 역시 추상클래스여서 객체를 생성할 수 없다.
		
		Triangle tri = new Triangle(10,15);
		tri.getArea();
		tri.getAround();
		
		
		 Ractangle rect = new  Ractangle(10,15);
		 rect.getArea();
		 rect.getAround();
		
	}
}
