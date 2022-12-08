package com.hanul.object;

public class Ex35_AccountMain {

	public static void main(String[] args) {
		
//		Ex34_Account account = new Ex34_Account();
		
//		// 홍길동씨의 은행계좌 객체를 생성해서 예금주, 계좌번호, 잔액을 출력	
//		account.accountNumber = "광주은행 777-777-777777";
//		account.name = "홍길동";
//		account.balance = 100000;
//		
//		System.out.println("계좌번호 : "+account.accountNumber );
//		System.out.println("예금주 : "+account.name );
//		System.out.println("잔 액 : "+account.balance );
//		System.out.println();
//		
//		//  5만원을 입금한 후 예금주, 계좌번호, 잔액을 출력
//		account.deposit(50000);
//		System.out.println("계좌번호 : "+account.accountNumber );
//		System.out.println("예금주 : "+account.name );
//		System.out.println("잔 액 : "+account.balance );
//		System.out.println();
//		// 3만원을 출금한 후 예금주, 계좌번호, 잔액을 출력
//		account.withDrow(30000);
//		System.out.println("계좌번호 : "+account.accountNumber );
//		System.out.println("예금주 : "+account.name );
//		System.out.println("잔 액 : "+account.balance );
//		
//		
		
		Ex34_Account account = new Ex34_Account();
		// 홍길동씨의 은행계좌 객체를 생성해서 예금주, 계좌번호, 잔액을 출력
		account.accountNo = "농협 777 -777 -123458";
		account.owner = "홍길동";
		
		//매소드를 만들어서 프린트 사용
		printAccount(account.owner,account.accountNo,account.balance);
		System.out.println();
		
	//  5만원을 입금한 후 예금주, 계좌번호, 잔액을 출력
		account.deposite(50000);
		printAccount(account.owner,account.accountNo,account.balance);
		System.out.printf("%s의 계좌번호는 %s이고, 잔액은 %d 원입니다. \n",account.owner,account.accountNo,account.balance);
	    System.out.println();
	    
	// 3만원을 출금한 후 예금주, 계좌번호, 잔액을 출력	
	    try {
			account.withdraw(200000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    printAccount(account.owner,account.accountNo,account.balance);
	    System.out.printf("%s의 계좌번호는 %s이고, 잔액은 %d 원입니다. \n",account.owner,account.accountNo,account.balance);
	    System.out.println();
	    
	    
	  //1.심청은 돈을 가지고 가지 않고 통장을 개설했다.(생성자가 잔돈이 없는 상태)
		 Ex34_Account sim = new Ex34_Account("심청","123-45-78910");
		 System.out.printf("%s의 계좌번호는 %s이고, 잔액은 %d 원입니다. \n",sim.owner, sim.accountNo, sim.balance);
		
	  //2. 전우치는 50000원을 내고 통장을 개설했다.(생성자가 모두 받아야 되는 상태)
		 Ex34_Account jeon = new Ex34_Account("전우치","789-45-78910",50000);
		 System.out.printf("%s의 계좌번호는 %s이고, 잔액은 %d 원입니다. \n",jeon.owner, jeon.accountNo, jeon.balance);
		
		
	
	
	
	
	
	
	    
	}

	//잔액, 계좌번호,이름 출력되는 매소드
	static void printAccount(String owner, String accountNo, int balance) {
		System.out.printf("%s의 계좌번호는 %s이고, 잔액은 %d 원입니다. \n",owner,accountNo,balance);
		
	}
	
	

}
