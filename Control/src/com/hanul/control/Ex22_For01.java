package com.hanul.control;

import java.util.Scanner;

public class Ex22_For01 {

	public static void main(String[] args) {

		// for문
		// for(초기화식; 조건식; 조건증감식){
		// 		실행명령문;
		// } 조건식이 참이면 실행명령문을 실행한다.
		 
		// *를 10개를 붙여서 한줄에 출력
		for(int i=0; i<10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// 1~10까지 한줄 출력하기
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		// 구구단 3단을 출력
		for(int i=1; i<=9; i++) {
			System.out.println("3 X " + i + " = " + i * 3);
		}
		System.out.println();
		//구구단 3단 출력하는 방법 중 변수를 두개주는 방법
		for(int i=1,d=3; i<=9; i++) {
			System.out.println("3 X " + i + " = " + i * d);
		}
		// 구구단 3단 출력하는 방법 중 프린트f 사용	
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d =%d\n ",3,i,3*i);
		}
		System.out.println();	
		
		
		// 1~10까지 합
		int sum = 0; 
		for(int i=1; i<11; i++) {
			sum = sum+i;
			System.out.printf("1부터 %d 까지의 합은 %d \n",i,sum);	
		}
		System.out.println("1부터 10까지의 총합 : "+sum);
		System.out.println();	
		
			
		// 1~10까지 숫자중 짝수만 출력 ==> for문 안에 짝수만 출력하라는 조건이 있으므로 if문 넣어서 사용
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();	
		
		
		
		// 실습1
		// 1~10까지의 수 중 홀수만 출력하는 프로그램 for문으로 작성
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println();	

		
		// 실습2
		// 출력하고 싶은 구구단 수를 입력받아 출력하는 프로그램 for문 작성
		Scanner sc = new Scanner(System.in); //스캐너는 한번 선언해주면 밑에서 안써도 또 쓸수있다
		System.out.println("몇단이 알고 싶나요? : ");
		int a = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n",a,i,a*i);
		}
		System.out.println();	
		
		
		
		// 실습3
		// 1부터 입력받은 수까지 합을 출력하는 프로그램 for문 작성
		//Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를 입력하세요~ 입력한 숫자만큼 총합을 알려줍니다. ");
		int b = sc.nextInt();
		int sum1 = 0;
		
		for(int i=1; i<=b; i++) {
			sum1 =sum1+i;
		}
		System.out.printf("1부터 %d 까지의 합은 %d \n",b,sum1);
		System.out.println();	
	
		
		// 실습4
		// 1부터 입력받은 수까지 중에서 3의 배수만 출력하는 프로그램을 for문으로 작성
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자를 입력하세요~ 3의 배수가 뭔지 알려줍니다. ");
		int c = sc.nextInt();
		
		for(int i=1; i<=c; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	
		
		
	}

}
