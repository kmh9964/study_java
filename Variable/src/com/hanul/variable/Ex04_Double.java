package com.hanul.variable;

public class Ex04_Double {

	public static void main(String[] args) {

		//	실수형 float(4byte), double(8byte) : 기본은 double
		//	float를 사용할때는 숫자 뒤에 f를 붙여줘야 됨
		//	1200000000 = 12X10^8
		//  0.0000000012 = 12X10^-10
		
		double pi = 3.14;
		System.out.println(pi);
		System.out.println("pi값 : " + pi);
		System.out.println("pi + 1 값 : " + (pi+1));
		//("pi + 1 값 : " + (pi+1));에서 문자로 인식하기 때문에 ()로 묶어서 숫자로 인식하게 함
		//()로 안묶어주면 숫자로 더해지지 않는다
		
		
		// 논리형 boolean(1byte) : true, false (참과 거짓으로만 판단)
		boolean isBreakfast = true;
		//변수 이름을 정할때 is(~이다)로 시작하는게 좋다.is로 시작하면 boolean형이다 
		System.out.println(isBreakfast); 
		boolean isLunch = false;
		System.out.println(isLunch);
		
		// 상수 Constant : 값을 바꿀수 없다.변하지 않는 값.앞에 final을 선언하면 값을 바꿀수 없다.
		 final double PI = 3.14;
		 //PI = 3.2;
		 System.out.println("원주율 : "+ PI);
		 
		 final int adult = 9;
		 System.out.println("adult : "+ adult);
		 //int adult라는 정수형 데이터타입 변수값을 final을 붙여서 변하지 못하는 상수로 바꿔줌
		 
		 //adult = 10;
		 //System.out.println("adult : "+ adult);
		//위에서 adult 앞에 final을 붙여서 상수로 되서 에러가 난다
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
