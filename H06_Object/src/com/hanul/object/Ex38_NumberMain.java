package com.hanul.object;

public class Ex38_NumberMain {

	public static void main(String[] args) {

		Ex38_Member	hong = new Ex38_Member("홍길동","hong","1234**");
//		System.out.println("이름: " + hong.name);
//		System.out.println("ID: " + hong.id);
//		System.out.println("PassWord: " + hong.pW);
//		System.out.println("전화번호: " + hong.phoneNo);
//		System.out.println("나이: " + hong.age);
//		System.out.println("--------------------------" );
		hong.changephoneNo("010-9999-7777");
		hong.changePassWord ("12345@@");
		hong.changeAge(21);
		printMember(hong.name,hong.id,hong.pW,hong.phoneNo,hong.age);
	
		Ex38_Member	sim = new Ex38_Member("심청","sim","1234@@",
				"010-1111-7777",21);
		sim.changePassWord ("7777!!");
		sim.changeAge(33);
//		System.out.println("이름: " + sim.name);
//		System.out.println("ID: " + sim.id);
//		System.out.println("PassWord: " + sim.pW);
//		System.out.println("전화번호: " + sim.phoneNo);
//		System.out.println("나이: " + sim.age);
//		System.out.println("--------------------------" );
//		printMember(sim.name,sim.id, sim.pW,
//				sim.phoneNo,sim.age);
		printMember(sim);
		printMember(sim,100);
		
		
		
	}
	
	static void printMember(String name, String id, String pW,
			String phoneNo, int age) {
		System.out.println("이름: " + name);
		System.out.println("ID: " + id);
		System.out.println("PassWord: " + pW);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("나이: " + age);
		System.out.println("--------------------------" );
	
	}
	static void printMember(Ex38_Member member) {
		System.out.println("이름: " + member.name);
		System.out.println("ID: " + member.id);
		System.out.println("PassWord: " +member. pW);
		System.out.println("전화번호: " + member.phoneNo);
		System.out.println("나이: " + member.age);
		System.out.println("--------------------------" );
		
	}
	static void printMember(Ex38_Member member,int total) {
		System.out.println("이름: " + member.name);
		System.out.println("ID: " + member.id);
		System.out.println("PassWord: " +member. pW);
		System.out.println("전화번호: " + member.phoneNo);
		System.out.println("나이: " + member.age);
		System.out.println("total: " + total);
		System.out.println("--------------------------" );
		
		
	}

}


