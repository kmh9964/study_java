package com.hanul.pack;

import com.hanul.geometry.Ex47_Circle;//다른 패키지에 있는 것을 가져다 쓰려면 임포트 해주자

public class Ex48_CircleMain {

	public static void main(String[] args) {
		//정보은닉:같은패키지 안에서도 데이터를 수정하지 못하도록 방어하는것(private사용)
		//반지름이 15cm인 원의 객체를 생성
		com.hanul.geometry.Ex47_Circle cir1 = null;
		try {
			cir1 = new Ex47_Circle(15);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//예외처리때문에 
		
		//그 객체의 원의 넓이를 구해서 출력
		double a1 =cir1.getArea();
		System.out.println("원의 넓이: " + a1);
		
		//원의 둘레를 출력
		double b1 =cir1.getRoundLengh(); 
		System.out.println("원의 둘레: " + b1);
		
		
		//반지름이 3cm인 원의 객체를 생성
		Ex47_Circle cir2 = null;//참조형이기때문에 null로 초기값 준다
		try {
			cir2 = new Ex47_Circle(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//그 객체의 원의 넓이를 구해서 
		int ra2 = cir2.getRadius();//cir2에 대한 반지름 접근하는것
		double a2 =cir2.getArea();//넓이
		double b2 =cir2.getRoundLengh();//둘레
		//반지름과 원의 넓이, 원의 둘레를 출력
		System.out.println("반지름: "+ra2+", " +
				"원의 넓이: " + a2+", "+"원의 둘레: " + b2);	
	
		System.out.printf("반지름: %d, 원의 넓이: %.2f, 원의 둘레: %.2f \n",ra2
				,a2, b2);	
		
		
		
		
		
			
		
	}

}
