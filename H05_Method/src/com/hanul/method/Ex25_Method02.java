package com.hanul.method;

public class Ex25_Method02 {

	public static void main(String[] args) {

		add(1,2);
		sub(3,2);
		
	System.out.println();	
		
		
	}
	//사칙연산을 하는 매소드 만들기
	//add(int no1, int no2):두수를 더한값을 출력
	//sub(int no1, int no2) :두수를 뺀값을 출력
	static void add(int no1, int no2) {
		System.out.println(no1+no2);
		System.out.println();
	}
	
	static void sub(int no1, int no2) {
		System.out.println(no1-no2);
	}
	
	
	
	
}
