package com.hanul.control;

import java.util.Random;

public class Ex17_Switch03 {

	public static void main(String[] args) {

		// 윷을 던져 결과를 출력
		// 앞 : 1,  뒤 : 0
		// 도:앞뒤뒤뒤-1, 개:앞앞뒤뒤-2, 걸:앞앞앞뒤-3, 윷:앞앞앞앞-4, 모:뒤뒤뒤뒤-0
		// 4개의 윷 숫자를 받는다
		Random r = new Random();
		int bar1 = r.nextInt(2);
		int bar2 = r.nextInt(2);
		int bar3 = r.nextInt(2);
		int bar4 = r.nextInt(2);	
		System.out.println("" + bar1 + bar2 + bar3 + bar4);
		// 각 윷의 숫자를 더해서 1이면 도 2이면 개 3 걸 4 윷 0 모
		int yut = bar1 + bar2 + bar3 + bar4;
		
		switch(yut) {
			case 0:
				System.out.println("모");
				break;
			case 1:
				System.out.println("도");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("걸");
				break;
			case 4:
				System.out.println("윷");
				break;
		
		}
		
//		if(yut == 1) {
//			System.out.println("도");
//		}else if(yut == 2) {
//			System.out.println("개");
//		}else if(yut == 3) {
//			System.out.println("걸");
//		}else if(yut == 4) {
//			System.out.println("윷");
//		}else if(yut == 0) {
//			System.out.println("모");
//		}
				
		
	}

}
