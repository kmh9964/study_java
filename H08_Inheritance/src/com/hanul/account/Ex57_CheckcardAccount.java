package com.hanul.account;

public class Ex57_CheckcardAccount extends Ex55_Account {
// Ex55_Account 것을 상속한 하위 클래스다
	
	

	String cardNo;//체크카드번호
	

//	  // 생성자 만들기=>오른쪽 마우스 눌러서 3가지 다 만들기
//	  Ex57_CheckcardAccount(String owner, String accountNo, int balance) {
//		  this(accountNo, owner);
//		  this.balance = balance;
//	  }
//	  //생성자 만들기=>매개변수 없이 생성
//	  Ex57_CheckcardAccount(){
//	  }
//	  //생성자 만들기 =>잔돈 부분이 없는 생성자 만들기
//	  Ex57_CheckcardAccount(String owner, String accountNo) {
//		  this.accountNo = accountNo;
//		  this.owner = owner;
//	  }	  
	  //생성자 만들기=> 체크카드 번호 추가
	  Ex57_CheckcardAccount(String owner, String accountNo, int balance,String cardNo) {
		  super(owner,accountNo,balance);//this를 super로 바꿔줌(상속이니깐)
		  this.cardNo = cardNo;
	  }
	  //생성자 만들기=> 체크카드 번호 추가
	  Ex57_CheckcardAccount(String owner, String accountNo, String cardNo) {
		  super(owner,accountNo);
		  this.cardNo = cardNo;
	  }
//
//	 //예금 매소드 : 입금한 금액만큼 잔액을 증가시키고 리턴하는 데이터가 없는 메소드로 선언
//	 void deposit(int money) {
//		balance += money;
//		System.out.println(money + " 입금하셨습니다.");
//	}
//	//출금 매소드 : 출금 요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드로 선언 	
//	int withDrow(int money){
//		balance -= money;
//		System.out.println(money + " 출금하셨습니다.");
//		return money;
//	}
//	//출금 매소드 : 출금 요청한 금액만큼 잔액을 감소시키고 출금한 금액을 리턴하는 메소드(int형)로 선언	
//	//잔액보다 출금 금액이 많으면 return 0;이 아니라 예외처리한다
//	int withdraw(int amount) throws Exception {//예외처리를 해준것
//		if(balance < amount) {
//			throw new Exception("출금 금액보다 잔액이 부족합니다.");
//		}	
//		//return 0; // return이 있으면 그 아래는 실행을 안하고 빨간줄이 나온다.
//		balance -= amount;
//		return amount;
//	}
		
	//체크카드 출금하기 매소드
	//throws Exception 예외처리를 해준것=> 가져다 쓸때는 try~catch로 감싸줄것
	int pay(String cardNo, int amount) throws Exception{
		//CD기에 넣은 카드와 계좌에서 발급된 체크카드가 일치하는지 확인
		//일치하지 않으면 일치하지 않는다는 문구를 나오게 하고 일치하면 밑의 if문을 실행
		if(!cardNo.equals(this.cardNo)) {//=>!를 쓰면 아니라면~
			throw new Exception("카드가 일치하지 않습니다.");
		}
//		//카드가 일치하고 잔액이 출금액보다 많으면 출금,적으면 출금 안됨
//		if(balance < amount) {
//			throw new Exception("출금 금액보다 잔액이 부족합니다.");
//		}	
//		balance -= amount;
//		return amount;
		return withdraw(amount);
		
		
	}
		
	
	
	
	
	
	
	
	
	
}
