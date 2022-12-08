package com.hanul.account;

public class Ex58_CheckcardAccountMain {

	public static void main(String[] args) {

		Ex57_CheckcardAccount hong =
				new Ex57_CheckcardAccount
				("홍길동","12-124-12456",10000,"12-12-12");
		
		try {
			int amount = hong.pay("12-12-12", 5000);
			System.out.println("카드로 뽑은 금액 : "+ amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		
	}

}
