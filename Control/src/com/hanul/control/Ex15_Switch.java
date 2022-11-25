package com.hanul.control;

public class Ex15_Switch {

	public static void main(String[] args) {

		// switch ~ case 문 break
		// switch(기준값){  // 문자, 문자열, 정수(long 제외)
		// 		case 판단값1 :
		//			실행명령문1
		// 			break;
		//		case 판단값2 :
		//			실행명령문2
		// 			break;
		//				...
		// }
		
		// 홀수/짝수를 판단하는 switch문
		int no1 = 9;
		switch(no1%3) {
			case 0:
				System.out.println("3의배수");
				break;
			default:  // 위에서 조건에 만족하는 것이 없으면 무조건 수행 
				System.out.println("3의 배수가 아님");
					
//			case 1:
//				System.out.println("나머지 1");
//				break;
//			case 2:
//				System.out.println("나머지 2");
//				break;	
		}
		
		int no2 = 2;
		switch(no2) {
			case 1:
				System.out.println("금메달");				
			case 2:
				System.out.println("은메달");				
			case 3:
				System.out.println("동메달");	
		}
		
		switch(no2 % 3) {
			case 0:
				System.out.println("3의 배수");	
				break;
			case 1:							
			case 2:
				System.out.println("3의 배수가 아님");
				break;
		}
	}

}
