package com.hanul.control;

import java.util.Random;

public class Ex21_SiRoPaWhile {

	public static void main(String[] args) {
			//
		
			int scissors = 0,  rock = 1, paper = 2;
			Random r= new Random();
			System.out.println("가위~바위~보!!");
			//먼저 유저와 컴퓨터가 각각 랜덤수를 받는다.
			int user = 0;  
			int computer = 0;
			
			do{
				user = r.nextInt(3);  // 0,1,2의 수를 입력받는다는 뜻
				computer = r.nextInt(3);
				System.out.printf("사용자 %d, 컴퓨터 %d \n" , user, computer);
				if(user == computer) {
					System.out.println("무승부 다시 던지세요");
				}
			}while(user == computer);
				
			//유저가 이기는 경우는 (유저:가위,컴퓨터:보)  (유저:바위,컴퓨터는:가위)  (유저:보,컴퓨터:바위)
			//유저와 컴퓨터가 같은 경우 무승부
			//나머지는 유저가 진다		
			
			if(user == scissors && computer == paper  ) {
				System.out.println("user 승");
			}else if (user == rock && computer == scissors) {
				System.out.println("user 승");
			}else if (user == paper && computer == rock) {
				System.out.println("user 승");
	        }else {
	        	System.out.println("comprter 승");
	        }
			
		
		
		
		
		
		
		
		
		
	}

}
