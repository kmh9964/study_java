package com.hanul.method;

import java.util.Scanner;

public class Ex26_Method03 {

	public static void main(String[] args) {
		
		//매개변수를 숫자로 받아서 그 숫자가 홀수 짝수를 판단하여 문자열을 리턴하는 메소드를 선언
		

		//1부터 입력한 수까지의 합을 구하는 값을 리턴하는 매소드 만들고, 합을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요~   ");
		int no1 = sc.nextInt();

		String ch = str(no1);
		System.out.printf(ch);
	    System.out.println();
	    
		int sum = returnsum(no1);
		System.out.println("1부터 " + no1 + "까지 합은 : " + sum);
		
	}
	
	//입력받은 수가 짝수인지, 홀수인지 판단하는 매소드
	static String str(int a) {
		String ch;
		if(a%2==0) {
			ch = "짝수";
		}else {
			ch = "홀수";
		}
		return ch;
	}
	
	//1부터 입력 받은 수까지 합을 구하는 매소드
	static int returnsum(int b) {
		int sum = 0; //for문을 이용해서 1 ~ int b까지 반복해서 합을 구하게 하는 것==>변수b의 값은 main매소드블럭에서 Scanner를 통해 입력받는다
		for(int i=1; i<=b; i++) {
		 sum = sum + i;
		}
		return sum;
		
	}
	
	
	
	
	
}




