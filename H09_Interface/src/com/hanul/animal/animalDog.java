package com.hanul.animal;

public class animalDog extends animal implements IAnimal {

	//개
	//매소드: 먹는다, 잠을잔다,땅위를 달린다
	
	animalDog(String kind) {
		super(kind);
		
	}
	
	void run() {
		System.out.println(kind + "가 땅위를 달린다.");
	}

	@Override
	public void sound() {
       System.out.println(kind  + "가 멍멍 짖는다.");		
	}
	
	
	
}
