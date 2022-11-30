package com.hanul.method;

import java.util.Scanner;

public class Ex27_Method04 {

	public static void main(String[] args) {

		//실습1
		//Scanner로 두 수를 입력받아 곱셈연산을 한 결과와 나눗셈 연산을 한 결과를 리턴하는 매소드를 만들고 
		//그 결과들을 더하고(변수 sum) 뺀(변수 sub) 경우를
		//변수에 입력해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요~   ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		int a = multi(no1,no2);//200
		System.out.println("두수의 곱 " + a );
		
		int b = div(no1,no2);//2
		System.out.println("두수의 나누기 " + b );
		
		int sum = a+b;
		int sub = a-b;
		System.out.println("두수의 합은 "+ sum + " 두수의 차는 " + sub );
		
		
		//실습2
		//위에서 입력받은 두 수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드를 만들고
		//메인에서 그 수를 출력
		int sum1 = returnsum(no1 , no2);
		System.out.println(" 누적합은 " + sum1 );
		
		int sum2 = resum(no1 , no2);
		System.out.println(" 누적합은 " + sum2 );
		
		int sum3 = raReSum(no1 , no2);
		System.out.println(" 누적합은 " + sum3 );
		
		
		
	}
	//두수의 곱의 값을 리턴하는 매소드
    static int multi(int no1, int no2) {
    	int mul = no1*no2;
    	return mul;  //200
    }
    //두수의 나누기 몫을 리턴하는 매소드
    static int div(int no1, int no2) {
    	int divi = no1/no2;
    	return divi; //2
    }
    
    //두수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드
	static int returnsum(int no1, int no2) {
		int sum1 = 0;
		if(no1<no2) {
			for(int i=no1; i<=no2; i++) {
				sum1 = sum1 + i;
			}
		}else {
			for(int i=no2; i<=no1; i++) {
				sum1 = sum1 + i;
			}
		} 
		 return sum1;
		
	}
    //두수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드
	static int resum(int no1, int no2) {
		int sum1 = 0;
		if(no1>no2) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
			for(int i=no1; i<=no2; i++) {
				sum1 = sum1 + i;
			}
	} 
		return sum1;
	}
	

	static int raReSum(int no1, int no2) {
		int sum2 = 0;
		if(no1>no2) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
			for(;no1<=no2; no1++) {
				sum2 = sum2 + no1;
			}
	} 
		return sum2;
	} 	
	
	
	
	
	
	
	

}
