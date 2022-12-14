package com.hanul.interfac;

public class Triangle extends Shape implements IShape{//Shape걸 상속 받았고 IShape 구현
	
	int length;//밑변
	
	//생성자 : 상속과 관련된 생성자임
	public Triangle(int high, int length) {
		super(high);
		this.length = length;
	}
	
	//implements와 관련된 (추상)매소드를 강제로 사용해야 된다
	@Override
	public void getArea() {
		System.out.printf("높이 %d 밑변 %d인 직삼각형의 넓이는 %.2f이다.\n"
				,high,length,(high+length)+length*high/(double)2 );
	}
	@Override
	public void getAround() {
		System.out.printf("높이 %d 밑변 %d인 직삼각형의 둘레는 %.2f이다.\n",high,length,(high+length)+Math.sqrt(length*length+high*high));
		
	}
	
	
	
	
	
	
	
	
	
}