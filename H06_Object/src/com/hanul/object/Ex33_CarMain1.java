package com.hanul.object;

public class Ex33_CarMain1 {

	public static void main(String[] args) {

		Ex32_Car1 car = new Ex32_Car1();
		
		car.owner = "김현식";
		car.modelName ="Qm3";
		car.speed = 0;
		
		// 김현식 소유의 QM3 차종 객체를 생성
		System.out.printf("%s의 차는 %s다.\n",car.owner, car.modelName);
		System.out.println();
		// 시동을 켜고 
		car.start();
		System.out.println();
		//엑셀을 5번 밟고 속도를 출력하고
		car.stepAccel(5);
		System.out.println();
		// 브레이크를 4번 밟고 속도를 출력하세요
		car.stepBreak(4);
		System.out.println();
		//시동을 끈다.
		car.stop();
		
		
		
		
		
		
		
		
		
		
	}

}
