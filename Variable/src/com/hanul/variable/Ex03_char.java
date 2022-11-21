package com.hanul.variable;

public class Ex03_char {

	public static void main(String[] args) {

		char ch1 = 'A', ch2 = '가';
		// char은 문자 타입, 값이 하나만 가능, 문자('A')하나여서 작은따옴표로 묶어줘야 됨.
		// ch2 = ''; 빈공간으로 초기화하는건 안된다.		
		System.out.println("ch1 에 저장된 값은 " + ch1 + " 입니다");
		System.out.println("ch1 에 저장된 값은 " + ch2 + " 입니다");
		
		String str= "가나다";
        // String에서 S는 꼭 대문자료 표기		
        // String은 문자열 타입, 큰따옴표로 묶음
		// String str= "";이렇게만 줬을때 값이 초기화되서 빈공간으로 나옴
		System.out.println("str 에 저장된 값은 " + str + " 입니다");
		
		
		System.out.println("문자 A의 정수값은 " + (int)ch1 + " 입니다");
		System.out.println("문자 가의 정수값은 " + (int)ch2 + " 입니다");
		
		System.out.println("문자 65의 문자값은 " + (char)ch1 + " 입니다");
		System.out.println("문자 44032의 문자값은 " + (char)ch2 + " 입니다");
		
		// 이스케이프(Escape)문자
		// 문자를 문자 자체가 아니라 특정 기호로 인식하게 할때 사용	
		// \t(tab),\n(줄바꿈),\\(\을 그대로 사용하고자 할때),\'('로 사용),\"("로 사용)		
		
		System.out.println("여러분~~\n\t\"반갑습니다!\"");
		
		
		
	}

}
