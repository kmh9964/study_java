package com.hanul.absta;

abstract public class Ex63_animal2 {//부모 클래스, 밑에 추상 매소드가 있으니깐 abstract를 써줘야 된다.

	
		//품종
		//매소드: 먹는다, 잠을잔다
		
		String kind;
		
		Ex63_animal2(String kind){
			this.kind = kind;
			System.out.println("동물의 품종 : "+ kind);
		}
		
		void eat() {
			System.out.println(kind + "가 먹는다.");
		}
		 
		void sleep() {
			System.out.println(kind + "가 잠을 잔다.");
		}
	
		//비슷한 일을 추상(abstract) 매소드로 선언만 하고 구현하지는 않는다.
		//추상 클래스는 상속을 받아서만 사용 가능.무조건 자식클래스는 상속 받아야 된다. 
		//자식 클래스에 가서 @Override해줄것
		abstract void sound(); 
			
		
		
	
}
