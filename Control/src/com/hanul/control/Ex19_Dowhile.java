package com.hanul.control;

import java.util.Scanner;

public class Ex19_Dowhile {

	public static void main(String[] args) {

		//do{~} ~ while(조건식);문은 무조건 do문을 한번은 실행한다.while(조건식)뒤에 무조건 ;이 와야 된다
		//반복문에서 빠져 나올때는 break; 사용한다.
		//1~10까지 출력해보자
		int no1 = 1; //1~10까지 변하는 변수이다
		do {
			System.out.println(no1);
			no1++;
		}while(no1 <= 10);
		
		
		//스캐너로 숫자를 입력받아 그 수가 10이상일 경우에만 빠져나오는 do~while문을 작성.
		//10보다 작은수를 입력했을때는 계속 입력받고, 10보다 큰수를 입력받았을 땐 멈춘다
		Scanner sc = new Scanner(System.in);
		int no2 = 0;
		do {
			System.out.println("10보다 작은 숫자를 입력하세요 : ");
			no2 = sc.nextInt();
			System.out.println("입력받은 수는:" + no2);			
		}while(no2 < 10 ); //10이상이므로 
		
		System.out.println("10 이상의 수를 입력하셨습니다." + no2);	
		sc.close();
		
		
		
	}

}
