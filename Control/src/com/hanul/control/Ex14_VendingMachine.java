package com.hanul.control;

import java.util.Scanner;

public class Ex14_VendingMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		   
		System.out.println("---- 자판기 메뉴 ----");
		System.out.println("1.콜라    : 1250원");
		System.out.println("2.레쓰비 : 800원");
		System.out.println("3.코코팜 : 1000원");
		
		// 변수 선언
		int coke = 1250;
		int letsbe = 800;
		int cocopalm = 1000;
		boolean choosableNo1 = false, choosableNo2 = false, choosableNo3 = false;

		System.out.println("투입구에 돈을 넣으세요.");
		int money = sc.nextInt();
		System.out.println("투입금액 : " + money );
		
		//투입된 금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 처리한다.
		if( money >= 1250 )		choosableNo1 = true;
		if( money >= 1000 )		choosableNo3 = true;
		if( money >= 800 ) 		choosableNo2 = true;
		   	   
		System.out.println("1.콜라   : 1250원  " + ( choosableNo1 ? "[선택가능]" : ""));
		System.out.println("2.레쓰비 : 800원  " + (choosableNo2 ? "[선택가능]" : ""));
		System.out.println("3.코코팜 : 1000원  " + (choosableNo3 ? "[선택가능]" : ""));
		System.out.println("음료를 선택하세요.");		   

		int choice = sc.nextInt();	
		int change = 0;    //거스름돈
		if( choosableNo1 && choice == 1 ) {
			change = money - coke;
			System.out.println("콜라 나온다");
		}else if( choosableNo2 && choice == 2 ) {
			change = money - letsbe;
			System.out.println("레쓰비 나온다");
		}else if( choosableNo3 && choice == 3 ) {
			change = money - cocopalm;
			System.out.println("코코팜 나온다");
		}else{
			change = money;
		}
		System.out.println("잔액 : " + change );
		

		//거스름돈 처리하기

		if( change > 0 ) {		   
			int c1000 = 0, c500 = 0, c100 = 0, c50 = 0;   
			System.out.print("거스름돈 ");
			
//			c1000 = change/1000;
//			c500 = change%1000/500;
//			c100 = change%1000%500/100;
//			c50 = change%1000%500%100/50;

			// change = 1250 라고 가정하면
			
			c1000 = change / 1000; // c1000 : 1
			change = change % 1000; // change : 250
			if( c1000 > 0 )    //거스름돈이 1000원짜리가 있는 경우만 출력
				{ System.out.println("1000원 " + c1000 + "장 ");}

			c500 = change / 500; // 250/500  c500:0
			change = change % 500; // channge:250
			if( c500 > 0 )   		
				{System.out.println("500원 " + c500 + "개 ");}

			c100 = change / 100; // 250/100  c100:2
			change = change % 100; // change:50
			if( c100 > 0 )			
				{System.out.println("100원 " + c100 + "개 ");  } 

			c50 = change / 50;  // 50/50 c50:1
			change = change % 50; // change:0
			if( c50 > 0 )			
				{System.out.println("50원 " + c50 + "개 ");}

			System.out.println(" 나온다");
		}
	}

}
