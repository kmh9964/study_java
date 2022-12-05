package com.hanul.object;

public class Ex34_Account {

		// 필드: 계좌번호, 예금주, 잔액
		// 메소드: 예금한다 메소드, 출금한다 메소드
    	// 예금한다: 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드로 선언(void)
		// 출금한다: 출금요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드로 선언(리턴형식:int)

		// 계좌번호, 예금주, 잔액
//		String accountNumber;
//		String name;
//		int balance;//잔액 0원
//	
//		//예금 매소드 : 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드로 선언
//		void deposit(int money) {
//			balance += money;
//			System.out.println(money + " 입금하셨습니다.");
//		}
//		//출금 매소드 : 출금 요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드로 선언 	
//		int withDrow(int money){
//			balance -= money;
//			System.out.println(money + " 출금하셨습니다.");
//			return money;
//		}
//		
		
	
	// 생성자 만들기=>오른쪽 마우스 눌러서 3가지 다 만들기
	   String accountNo;
	  Ex34_Account(String owner, String accountNo, int balance) {
		  this.accountNo = accountNo;
		  this.owner = owner;
		  this.balance = balance;
	  }
			
	  //생성자 만들기=>매개변수 없이 생성
	  Ex34_Account(){
	  }
	  //생성자 만들기 =>잔돈 부분이 없는 생성자 만들기
	  Ex34_Account(String owner, String accountNo) {
		  this.accountNo = accountNo;
		  this.owner = owner;
	  }	  
			
	  
	  
	  
	// 필드(타입 변수) : 계좌번호, 예금주, 잔액
	String owner;
	   int balance;//int형은 0으로 초기화 된다.
	   
	 //예금 매소드 : 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드(void)로 선언   
	  void deposite(int amount) {
		  balance += amount;
	  }
	//출금 매소드 : 출금 요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드(int형)로 선언	
	//잔액보다 출금 금액이 많으면 return 0;
		int withdraw(int amount) {
			if(balance < amount) {
				System.out.println("출금 금액보다 잔액이 부족합니다.");
				return 0; // return이 있으면 그 아래는 실행을 안하고 빨간줄이 나온다.
			}
			balance -= amount;
			return amount;
		 
		}
		
}
