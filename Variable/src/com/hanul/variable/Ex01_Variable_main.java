package com.hanul.variable;

public class Ex01_Variable_main {

	public static void main(String[] args) {

//		System.out.println(75);
//		System.out.println(0b1001011);
//		System.out.println(0113);
//		System.out.println(0x4b);
		
		//선언: 데이터타입 변수명 => int num; => 여기에서 int가 정수데이터 타입, num이 변수가 된다.
		int num;
		//초기화 : 초기값을 넣어주는것
		num = 10;
		//선언과 초기화를 같이 할수 있다
		int num1 = 15;
		//여러개를 같이 쓰고자할때 (같은 타입만 가능하다)		
		int num2 = 21, num3 = 22, num4 = 24;
		//		
		
		System.out.println(num);
		System.out.println(num1 + num2);
		System.out.println(num2 + num3);
		System.out.println(num3 - num2);
		
//		한번 데이터 타입을 선언했으면 다시 한번 선언할 필요가 없다.
		
		char ch = 'A'; 	//char은 문자데이터 타입이고, ch는 변수가 된다.
		System.out.println(ch);
		
		num3 = 500;	//위에서 int라고 정수 데이터 타입을 지정해줘서 안해도 되고, 변수에 들어가는 값만 바뀜
		num4 = 600;
	
		System.out.println(num4 - num3);
		
		num3 = 700;	//위에서 int라고 정수 데이터 타입을 지정해줘서 안해도 되고, 변수에 들어가는 값만 바뀜
		num4 = 800;
	
		System.out.println(num4 - num3);
		
		
	}
	
}
