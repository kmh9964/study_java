package com.hanul.method;

public class Ex25_Method02 {

	public static void main(String[] args) {

		add(1,2);
		sub(3,2);
		
		System.out.println();	
		
		int di = div(30,3); // 아래에서  div 메소드에서 int로 리턴시켰기때문에 int형 변수를 만들어서 값을 받아야된다
			System.out.printf("di = %d\n",di);
			System.out.println();
			
			
			
		//multi에서 곱합값과 div에서 나눈값을 합해서 출력해라
		int mul = multi(10,20);
			System.out.printf("mul =%d\n ",mul);
		
		int di1 = div(30,3);
			System.out.printf("di1 =%d\n ",di1);
		
		int sum = mul + di1;
			System.out.printf("sum =%d\n ",sum);
		
	}
	//사칙연산을 하는 매소드 만들기
	//add(int no1, int no2):두수를 더한값을 출력
	//sub(int no1, int no2) :두수를 뺀값을 출력
	static void add(int no1, int no2) {
		System.out.println(no1+no2);
		System.out.println();
	}
	
	static void sub(int no1, int no2) {//void는 리턴값이 없다는 뜻
		System.out.println(no1-no2);
	}
	
	static int multi(int no1, int no2) {//void 대신에 리턴값을 int로 줬기때문에 main 메소드 블럭에 가서 받을때도 int형으로 받아야 된다
		int mul1 = no1 * no2;
		return mul1;
	}
	
	
	static int div(int no1, int no2) {
		int di = no1 / no2;
		return di;
	}
	
	
	
	
	
	
	
	
	
	
	
}
