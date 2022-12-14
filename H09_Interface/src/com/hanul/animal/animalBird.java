package com.hanul.animal;

public class animalBird extends animal implements IAnimal{

	
		//새
		//매소드: 먹는다, 잠을잔다,땅위를 달린다
	
		
		animalBird(String kind) {//생성자는 부모클래스에서 선언한 뒤 자식클래스에서 이렇게 받아줘야된다
			super(kind);
		}
		
	
		void fly() {
			System.out.println(kind + "가 하늘을 난다.");
		}


		@Override
		public void sound() {
				System.out.println( kind + "가 짹짹 운다." );
		}
			
		
	
}
