package com.hanul.shape;

public class Triangle extends Shape{

	//밑변, 높이
	//넓이를 구한다
	
	int length;
	
	public Triangle(int high,int length) {
		super(high);
		this.length = length;
	}
	
	@Override//재정의한다라는 뜻
	 void getArea() {
		double area = (high * length)/(double)2;
		System.out.printf("높이 %d 밑변 %d인 직각삼각형의 넓이는 %.2f다. \n" 
				,high,length,area );
		
	}
	
	double getArea1() {
		double area = (high * length)/(double)2;
		return area;
	}
	
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직각사각형의 둘레는 %.2f이다.\n"
				,high,length,(high+length)+(double)Math.sqrt(length*length+high*high));
		
	}
	
	
	
	
}
