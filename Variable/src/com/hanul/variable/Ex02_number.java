package com.hanul.variable;

public class Ex02_number {

	public static void main(String[] args) {

		
		byte no1 = -128;
//		byte no2 = 128; byte는 127까지인데 128이여서 에러남,빨간줄에 보면 무슨 에러인지 나옴 
		
		short no3 = 10000;
		int no4 = 1234567890;
		long no5 = 1234567890;
		long no6 = 12345678900L;//int를 넘어서는 long형을 쓰려면 숫자 끝에 대문자, 소문자L을 넣자.
		
		int no7 = 800, no8 = 900;
		int sum = no7 + no8; //sum은 여기서 변수다.
		
		System.out.println(sum);
		
		int no10 = 1000, no9 = 1200;
		int sum1 = no9 - no10; //sum1은 여기서 변수다.
		System.out.println(sum1);
		
		int no11 = 123, no12;
		no12 = no8;//no12값을 지정해주지 않았지만 여기서 no12를 no8 값을 가져다 쓰기로 한다고 지정
	    System.out.println(no12);
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
