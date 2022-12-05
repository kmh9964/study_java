package com.hanul.object;

public class Ex37_Creater01Main {

	public static void main(String[] args) {
		//생성자=>생성자를 만들때 파라미터가 들어간 경우
		Ex36_Creater01 hong = new Ex36_Creater01("홍길동");
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", hong.owner, hong.total);
		
		//생성자=>생성자를 만들었지만 파라미터가 안들어간 경우
		Ex36_Creater01 sim = new Ex36_Creater01("심청이");
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", sim.owner, sim.total);
		
		//생성자=>생성자를 만들때 파라미터가 두개가 들어간 경우
		Ex36_Creater01 jeon = new Ex36_Creater01("전우치",50000);
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", jeon.owner, jeon.total);
		
		//생성자를 만들때 자신의 클래스를 가르키는 예약어를 쓰려면 this.
		Ex36_Creater01 jun = new Ex36_Creater01(100000,"전우치");
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", jun.owner, jun.total);
		
		hong.inputMoney(300000);
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", hong.owner, hong.total);
		
		hong.outputMoney(50000);
		System.out.printf("%s의 계좌 금액은 %d 입니다.\n", hong.owner, hong.total);
		
	}

}
