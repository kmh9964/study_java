package com.hanul.shape;

public class Ractangle extends Shape{

	//밑변, 높이
	//넓이를 구한다
		
  int length;
	
  Ractangle(int high,int length) {
		super(high);
		this.length = length;
	}

	@Override
	void getArea() {
		
		double area = high * length ;
		System.out.printf("높이 %d 밑변 %d인 직각사각형의 넓이는 %.2f이다.\n"
				,high,length,area );
		
	}
	
	double getArea1() {
		double area = (high * length);
		return area;
	}
	
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직각사각형의 둘레는 %d이다.\n"
				,high,length,2*(high*length));
		
	}
	
	
	
	
}
