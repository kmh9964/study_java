package com.hanul.absta;

public class Ex64_dog extends Ex63_animal2 {

	   //개
	   //매소드: 먹는다, 잠을잔다, 멍멍 운다
		
	Ex64_dog(String kind) {
			super(kind);
			
		}
		
//		void cry() {
//			System.out.println(kind + "가 멍멍 운다.");
//		}

		@Override//부모클래스에 정의한것은 다시 정의해서 쓴다라는 뜻이다.
		void sound() {
			System.out.println(kind + "가 멍멍 짖는다.");
		}
		
	
	
	
	
}
