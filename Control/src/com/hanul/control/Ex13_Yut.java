package com.hanul.control;

import java.util.Random;

public class Ex13_Yut {

	public static void main(String[] args) {
		
		// 윷을 던져 결과를 출력
		// 앞:1, 뒤(모 기준):0
		// 도:앞뒤뒤뒤(합이 1), 개:앞앞뒤뒤(합이 2), 걸:앞앞앞뒤(합이 3), 윷:앞앞앞앞(합 4), 모:뒤뒤뒤뒤(합이 0)
		// 4개의 윷 숫자를 받는다.
		Random r = new Random();
		int a = r.nextInt(2);
		int b = r.nextInt(2);
		int c = r.nextInt(2);
		int d = r.nextInt(2);
		char result;
		int sum = a+b+c+d;
		//각 윷의 숫자를 더해서 1이면 도, 2이면 개, 3이면 걸, 4이면 윷, 0이면 모
		if(sum == 1) {
			result = '도';
		}else if(sum == 2) {
			result = '개';
		}else if(sum == 3) {
			result ='걸';
		}else if(sum == 4) {
			result='윷';
	    }else {
			result ='도';
		}	
		System.out.println(("a: " + a ) + (", b: " + b) + (", c: " + c ) + (", d: " + d));
		System.out.println("" + a  + b + c  + d);//()안에 ""를 써주는 이유는 변수가 숫자라 더해지는걸 방지하기 위해 문자열로 인식하게끔 ""넣어줌
		System.out.println(""+a + ','+b +',' + c + ',' + d);
		System.out.println("윷 결과는? " +  result );
		
		
		
		
		
		
		
	}

}
