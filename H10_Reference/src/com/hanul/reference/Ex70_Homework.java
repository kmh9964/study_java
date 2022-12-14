package com.hanul.reference;

public class Ex70_Homework {

	public static void main(String[] args) {

		// [과제] 다음의 이메일 주소에 대해서 for 문으로 아이디와 이메일서비스를 분류해서 출력하세요.
		// String email[] = { "hong1234@naver.com", "park901031@hanmail.net", "jeon@daum.net" };
		// (출력결과)   
		// 이메일: hong1234@naver.com
	    // 아이디 : hong2021
	    // 이메일서비스: naver.com	

		String email[] = { "hong1234@naver.com", "park901031@hanmail.net", "jeon@daum.net" };
		for(int i=0; i<email.length; i++) {

			System.out.println("이메일 : " + email[0].substring(0));
			System.out.println("아이디 : " + email[0].substring(0,8));
			System.out.println("이메일 서비스 : " + email[0].substring(9));
			System.out.println();
			
			System.out.println("이메일 : " + email[1].substring(0));
			System.out.println("아이디 : " + email[1].substring(0,10));
			System.out.println("이메일 서비스 : " + email[1].substring(11));
			System.out.println();
			
			System.out.println("이메일 : " + email[2].substring(0));
			System.out.println("아이디 : " + email[2].substring(0,4));
			System.out.println("이메일 서비스 : " + email[2].substring(5));
			break;
			
			
			
			
		}
		
		
		
		
	}

}
