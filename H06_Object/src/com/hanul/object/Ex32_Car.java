package com.hanul.object;

public class Ex32_Car {
	
	String owner;
	String modelName;
	int speed;
	
	//생성자 만들기
	Ex32_Car(String owner, String modelName, int speed){
		this.owner = owner;
		this.modelName = modelName;
		this.speed = speed;
	}
	Ex32_Car(){
		
	}
	
	// 매소드 : 시동건다  void start
	void start() {
		System.out.println("시동을 걸었습니다.");
	}
	//매소드 : 시동끈다 void stop
	void stop() {
		System.out.println("시동을 껐습니다.");
	}
	//매소드 : 엑셀을 밟는다 void stepAccel 
	//==> 속도가 40씩 증가, 100이상이 되면 100으로 유지
	void stepAccel() {
		speed += 40;
		if(speed >= 100) {
			speed = 100;
		}
		System.out.println("현재 속도는 : " + speed );
	}
	// 매소드 : 브레이크를 밟는다 void stepBreak 
	//==> 속도가 30씩 감소하고 0이하가 되면 0으로 유지
	void stepBreak(){
		
		speed -= 30;
		if(speed <= 0) {
			speed = 0;
		}System.out.println("현재 속도는 : " + speed);
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

