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
		
		int a = multi(no1,no2);
		System.out.println("두수의 곱 " + a );
		
		int b = div(no1,no2);
		System.out.println("두수의 나누기 " + b );
		
		int sum = a+b;
		int sub = a-b;
		System.out.println("두수의 합은 "+ sum + " 두수의 차는 " + sub );
		
		
		//실습2
		//위에서 입력받은 두 수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드를 만들고
		//메인에서 그 수를 출력
		int sum1 = returnSum(no1 , no2);
		System.out.println("누적합은 " + sum1 );
		
		int sum2 = reSum(no1 , no2);
		System.out.println("누적합은 " + sum2 );
		
		
		
		
	}
	//두수의 곱의 값을 리턴하는 매소드
    static int multi(int no1, int no2) {
    	int mul = no1 * no2;
    	return mul; //return no1*no2 이런식으로 해도  된다
    }
    //두수의 나누기 몫을 리턴하는 매소드
    static int div(int no1, int no2) {
    	int divi = no1/no2;
    	return divi; //return no1/no2 이렇게 해도 된다.
    }
    
    //두수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드
	static int returnSum(int no1, int no2) {
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
		 return sum1;  //return은 꼭 메인 블럭 안에 있어야 된다.{}잘 체크!!
		
	}
    //두수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 매소드
	static int reSum(int no1, int no2) {
		int sum1 = 0;
		if(no1>no2) {   //no1>no2라면 if문 실행 뒤 for문 실행
			int tmp = no1; //앞의 수가 뒤의 수보다 클 경우에 이렇게 하면 된다. no1이 no2가 크다
			no1 = no2;
			no2 = tmp;			
		} 
		for(int i=no1; i<=no2; i++) {//for문을 if문 밖으로 빼서 no1이 no2보다 작으면 for만 돌고 no1l이 no2보다 크면
			sum1 = sum1 + i;         //if문 실행된뒤 for문 실행
		}
		return sum1;
	}
	
		
		


	
	
	
	

}
