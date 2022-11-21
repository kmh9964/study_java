package com.hanul.variable;

public class Ex05_Casting {

	public static void main(String[] args) {

		byte no1 = 10;
		int no2 = no1;
		//작은 범위에서 큰 범위로 담는것은 에러가 나지 않는다
		
		float no3 = no2;
		System.out.println("float no3 : " + no3);
		
		double no4 = no3;
		System.out.println("double no4 : " + no4);
		
		no4 = 3.14;
		System.out.println("no4 : " + no4);
		
		no2 = (int)no4; //타입 변형 시 ()를 써서 강제시킴
		System.out.println("no2 : " + no2);
		
		no2 = 130;
		short no5 = (short)no2; //왼쪽 no2는 int형이다 => 그래서 강제로 short로 캐스팅!! 
		System.out.println("no5 : " + no5);
		
		no1 = (byte)no2; //왼쪽에 있는 no1이 byte형이니 오른쪽 int형을 (byte)넣어서 캐스팅
		System.out.println("no1 : " + no1);
		
		
		
		
		
		
		
		
		
		}

}
