package com.hanul.control;

import java.util.Random;

public class Ex20_DiceWhile {

	public static void main(String[] args) {
			
		
		//주사위 게임, 서로 비길때는 다시 한번 던지는 경우를 출력해라.
		
		Random r = new Random();
		//r.nertInt(6);===>()안의 숫자보다 1작은 경우의 수를 받는다는 뜻이다. 0부터 5까지 6가지의 경우수를 받는다는 뜻
		int user  = 0; //초기화
		int computer = 0;
		do {
			System.out.println("주사위를 던지세요~");
			user = r.nextInt(6) + 1;//주사위는 1~6까지의 숫자가 있으니 +1을 해주는거다.그래야 1~6이 받는게 된다.
			computer = r.nextInt(6) + 1;
			System.out.printf("사용자 %d, 컴퓨터 %d \n" , user, computer);
			if(user == computer) {
				System.out.println("무승부 다시 던지세요");
			}	
		}while(user == computer); //비길때, do {}안에 변수 user와 computer가 있으면 {}를 벗어났기때문에 안된다.do {} 위에 선언해야된다
		System.out.println("게임 끝!!"); 
		
		if(user > computer) {
			System.out.println( " user~ 승!! ");
			
		}else if(user < computer){ System.out.println( " computer~ 승!! ");
		}
		
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
