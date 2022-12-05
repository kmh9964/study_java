package com.hanul.object;

public class Ex33_CarMain {

	public static void main(String[] args) {

		Ex32_Car car = new Ex32_Car();
		
		car.owner = "김현식";
		car.modelName ="Qm3";
		
		
		// 김현식 소유의 QM3 차종 객체를 생성
		System.out.printf("%s의 차는 %s다.\n",car.owner, car.modelName);
		System.out.println();
		
		// 시동을 켜고 
		car.start();
		
		//엑셀을 4번 밟고 속도를 출력
		car.stepAccel();
		car.stepAccel();
		car.stepAccel();
		car.stepAccel();
		System.out.println();
		
		// 브레이크를 4번 밟고 속도를 출력
		car.stepBreak();
		car.stepBreak();
		car.stepBreak();
		car.stepBreak();
		System.out.println();
		
		//시동을 끈다.
		car.stop();
		System.out.println();
		
		
		// 본인 소유의 차종 객체를 생성
		Ex32_Car car1 = new Ex32_Car();
		car1.owner = "강미화";
		car1.modelName ="제네시스 G80";
		car1.speed = 0;
		
		System.out.printf("%s의 차는 %s이다.\n",car1.owner, car1.modelName);
		System.out.println();
		
		// 시동을 켜고 
		car1.start();
		
		//엑셀을 4번 밟고 속도를 출력
		car1.stepAccel();
		car1.stepAccel();
		car1.stepAccel();
		System.out.println();
		
		// 브레이크를 4번 밟고 속도를 출력
		car1.stepBreak();
		car1.stepBreak();
		car1.stepBreak();
		car1.stepBreak();
		System.out.println();
		
		//시동을 끈다.
		car1.stop();
		System.out.println();
		
		//생성자를 이용해서 차종이랑 차주인 출력
		Ex32_Car kang = new Ex32_Car("강미화","제네시스 G80",0);
		System.out.printf("%s의 차는 %s이다.\n",car1.owner, car1.modelName);
		
		
		
	}

}
