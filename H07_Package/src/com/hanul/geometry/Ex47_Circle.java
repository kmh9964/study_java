package com.hanul.geometry;

public class Ex47_Circle {
	
	

	// 원 클래스
	// 반지름 데이터, 넓이를 구하는 기능, 원의 둘레를 구하는 기능
	private int radius; //private가 붙으면 다른 클래스에서 사용 못함(접근제어)
	//생성자 만들기
	public Ex47_Circle(int radius) throws Exception {
		if(radius < 0) {
			throw new Exception("생성자:길이가 0보다 커야된다");
		}
		this.radius = radius;
	}
	//접근 제어 (private)해둔 원의 반지름을 가져올수 있는 매소드를 생성
	public int getRadius() {//다른패키지에 있는 클래스 함수나 변수, 생성자를 쓰려면 public써준다
		return this.radius;
	}
	//원의 반지름을 setting 할수 있는 매소드 생성==>메인에 가서 바꿔주는 매소드
	//set을 안만들면 초기값을 못 바꾼다
	//throws Exception 을 써서 예외처리를 하면 된다
	public void  setRadius(int radius) throws Exception {
		if(radius < 0) {
			throw  new Exception("길이가 0보다 커야된다");//()안은 개발자 마음대로 쓴다
		}
		this.radius = radius;
	}
	//넓이 구하는 공식 :2*반지름*3.14
	public double getArea() {
		return  2*3.14*radius;
	
	}//원의 둘레를 구하는 공식
	public double getRoundLengh() {
		return 3.14*radius*radius;
	}
	
	


	
	
	
	
	
	
	
	
	
	
	

}
