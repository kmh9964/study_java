package com.hanul.control;

import java.util.Random;

public class Ex12_RockScissorsPaper {

	public static void main(String[] args) {

		//가위:0,바위:1,보:2
		//랜덤 이용
		
		
		int scissors = 0,  rock = 1, paper = 2;
		Random r= new Random();
		//System.out.println("가위~바위~보!!");
		//먼저 유저와 컴퓨터가 각각 랜덤수를 받는다.
		int user = r.nextInt(3);
		int computer = r.nextInt(3);
		System.out.printf("사용자 %d, 컴퓨터 %d \n" , user, computer);
		//유저가 이기는 경우는 (유저:가위,컴퓨터:보)  (유저:바위,컴퓨터는:가위)  (유저:보,컴퓨터:바위)
		//유저와 컴퓨터가 같은 경우 무승부
		//나머지는 유저가 진다		
		
		if(user == scissors && computer == paper  ) {
			System.out.println("user 승");
		}else if (user == rock && computer == scissors) {
			System.out.println("user 승");
		}else if (user == paper && computer == rock) {
			System.out.println("user 승");
        }else if (user == computer) {
        	System.out.println("무승부");
        }else {
        		System.out.println("computer 승");
        }
        	
		//if문에 한번에 나오게 해보자
		System.out.println("user :" + user +',' + " computer: " + computer);
	    if((user == scissors && computer == paper) 
	    		|| (user == rock && computer == scissors) 
	    		|| (user == paper && computer == rock) ){
	    	System.out.println("user 승");
		}else if(user == computer) {
			System.out.println("무승부");
		}else {
			System.out.println("computer 승");
		}
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
