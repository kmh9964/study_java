package com.hanul.object;

public class Ex31_piggyBankMain {

	public static void main(String[] args) {

		// 이번 클래스가 돼지 저금통이 실행되는 클래스다.
		// 돼지 저금통 객체를 만든다. 또는 인스턴스를 만든다라고 한다.==>이때 메모리에 올란간다.
		
		Ex30_piggyBank pb = new Ex30_piggyBank();//pb안에는 piggyMoney 클래스 내용이 담긴다
		printBank(pb.owner , pb.total);//객체만 형성되고 초기화가 안된 상태에서 프린트 해보면 
		                               //null과 0으로 나온다
		System.out.println(); // 줄 바꿈용~
		
		pb.owner = "홍길동";			//그래서 초기화값을 굳이 안줘도 실행된다	
		pb.total = 0;				// 초기화값을 안줘도 실행된다
		
		printBank(pb.owner , pb.total);
		
		//저금통에 만원을 저금한다. pb객체 안에 존재하는 매소드 이므로꼭 pb. 으로 시작한다
		pb.inputMoney(10000);
		printBank(pb.owner , pb.total);
//		int total = pb.inputMoney(10000);//위의 내용처럼 해줘도 되고, retuen값을 받아서 해줘도 같은 결과!!
//		printBank(pb.owner ,total);
//		
		pb.outputMoney(5000);
		printBank(pb.owner , pb.total);
//		
//		int total1 = pb.outputMoney(5000);//위의 내용처럼 해줘도 되고, 이것처럼 해줘도 같은 결과!!
//		printBank(pb.owner , total1);
		
		
		//심청이의 돼지 저금통을 만들고 그 저금통에 20000원을 저금하여 출력
		//심청이의 돼지 저금통을 만들고 그 저금통에 8000원을 빼고 출력
		System.out.println();
		//방법 1 
		pb.owner = "심청";				
		pb.total = 0;		
		// 20000원 저금
		pb.inputMoney(20000);
		printBank(pb.owner,pb.total);
		// 8000원 출금
		pb.outputMoney(8000);
		printBank(pb.owner,pb.total);
		
		//방법 2 =>저금통을 따로 따로 각각 만들때는 객체를 가져다 쓰면 된다
		Ex30_piggyBank sim = new Ex30_piggyBank();
		sim.owner = "심청";				
		sim.total = 0;
		sim.inputMoney(20000);
		printBank(sim.owner, sim.total);
		sim.outputMoney(8000);
		printBank(sim.owner, sim.total);
		
		
	}
	
	//저금통의 이름과 금액을 출력하는 매소드	
	static void printBank(String owner, int total) {
		System.out.printf("%s 저금통의 총액은 %d원 입니다.\n", owner, total);
	}
	
	
}
