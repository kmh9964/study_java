package com.hanul.object;

public class Ex32_Car1 {

	String owner;
	String modelName;
	int speed;
	// 시동건다  void start
	void start() {
		System.out.println("시동을 걸었습니다.");
	}
	//시동끈다 void stop
	void stop() {
		System.out.println("시동을 껐습니다.");
	}
	// 엑셀을 밟는다 void stepAccel 
	//==> 속도가 40씩 증가, 100이상이 되면 100으로 유지
	void stepAccel(int accel) {
		speed += (accel*40);
		if(speed>100) {
			speed = 100;
		}
		System.out.println("현재 속도는 : " + speed );
	}
	// 브레이크를 밟는다 void stepBreak 
	//==> 속도가 30씩 감소하고 0이하가 되면 0으로 유지
	void stepBreak(int bre){
		speed -= (bre*30);
		if(speed<=0) {
			speed = 0;
		}System.out.println("현재 속도는 : " + speed);
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
