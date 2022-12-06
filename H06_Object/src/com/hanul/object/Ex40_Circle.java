package com.hanul.object;

public class Ex40_Circle {

		// 원 클래스
		// 반지름 데이터, 넓이를 구하는 기능, 원의 둘레를 구하는 기능
		private int radius; //private가 붙으면 다른 클래스에서 사용 못함(접근제어)
		//생성자 만들기
		public Ex40_Circle(int radius) {
			this.radius = radius;
		}
		//접근 제어 (private)해둔 원의 반지름을 가져올수 있는 매소드를 생성
		int getRadius() {
			return this.radius;
		}
		//원의 반지름을 setting 할수 있는 매소드 생성==>메인에 가서 바꿔주는 매소드
		void  setRadius(int radius) {
			 this.radius = radius;
		}
		//넓이 구하는 공식 :2*반지름*3.14
		double getArea() {
			return  2*3.14*radius;
		
		}//원의 둘레를 구하는 공식
		double getRoundLengh() {
			return 3.14*radius*radius;
		}
		
		
	
	
	
	
	
	
	
}
