package com.hanul.control;

public class Ex09_VariableRange {

	public static void main(String[] args) {

		//변수의 유효범위에 대해 알아보자
		//로컬변수 :선언된 블럭{ }안에서만 사용 가능
		//전역변수 :클래스 안에서 다 사용 가능
		
		int no1 = 5;
		String result;  // String result= " ";은 result 변수 값을 초기화 한다는 뜻
		if(no1%2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		} 	
		System.out.println(no1 + "," + result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
