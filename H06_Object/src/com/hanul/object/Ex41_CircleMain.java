package com.hanul.object;

public class Ex41_CircleMain {

	public static void main(String[] args) {
		//정보은닉:같은패키지 안에서도 데이터를 수정하지 못하도록 방어하는것(private사용)
		//반지름이 15cm인 원의 객체를 생성
		Ex40_Circle cir1 = new Ex40_Circle(15);
		
		//그 객체의 원의 넓이를 구해서 출력
		double a1 =cir1.getArea();
		System.out.println("원의 넓이: " + a1);
		
		//원의 둘레를 출력
		double b1 =cir1.getRoundLengh(); 
		System.out.println("원의 둘레: " + b1);
		
		
		//반지름이 3cm인 원의 객체를 생성
		Ex40_Circle cir2 = new Ex40_Circle(3);
		//그 객체의 원의 넓이를 구해서 
		int ra2 =cir2.getRadius();
		double a2 =cir2.getArea();//넓이
		double b2 =cir2.getRoundLengh();//둘레
		//반지름과 원의 넓이, 원의 둘레를 출력
		System.out.println("반지름: "+ra2+", " +
				"원의 넓이: " + a2+", "+"원의 둘레: " + b2);	
	
		System.out.printf("반지름: %d, 원의 넓이: %.2f, 원의 둘레: %.2f \n",ra2
				,a2, b2);	
		
		
	
		
		
			
		
	}

}
