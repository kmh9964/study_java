package com.hanul.control;

import java.util.Scanner;

public class Ex10_if03 {

	public static void main(String[] args) {
		
		//스캐너를 생성해서 나이를 입력 받아 버스비를 계산하는 프로그램 만들기
		//일반:20살 이상, 1250원, 청소년 : 14살 이상,800원
		//어린이 7살 이상,400원 , 유아7살 미만 0원
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("승객의 나이는?    "); 
//		int age = sc.nextInt(); 
//		System.out.println();
//		if(age < 8) {
//			System.out.println("유아," + "공짜");
//		}else if(age < 14) {
//			System.out.println("어린이, " + "400원");
//		}else if(age < 20) {
//			System.out.println("청소년, " + "800원");
//		}else {
//			System.out.println("일반, " + "1200원");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 =>    "); //
//		int age = sc.nextInt(); 
//		System.out.println();  // 줄바꿈을 하기 위해 해줌.
//		
//		int charge = -100;     // 버스비		
//		String ageGroup = " "; // 연령대
//		if (age < 8) {
//			ageGroup = "유아";
//			charge = 0;
//		}else if(age < 14) {
//			ageGroup = "어린이";
//			charge = 400;
//		}else if (age < 20)	{
//			ageGroup = "청소년";
//			charge = 800;
//		}else {	
//			ageGroup = "일반";
//			charge = 1250;
//		}	
//		
//		System.out.println(age + "살은 "+ ageGroup + "," + charge + "원 입니다.");	
//		System.out.printf("%s은 %d원 입니다 \n", ageGroup, charge);	
//	    sc.close();
//        
	    //입력한 시험점수에 따라 학점을 출력
	    //점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C ,60점 이상이면 D, 그 외는 F
	    //이때 학점은 char 타입 변수를 선업한 후 반드시 변수에 학점을 대입하자.
	    
	    Scanner sc1 = new Scanner(System.in);
	    System.out.print("점수를 입력하세요 =>    ");
		int score = sc1.nextInt(); 
		System.out.println();  // 줄바꿈을 하기 위해 해줌.
		char grade;
		
	    if (score >= 90 ) {
	    	grade = 'A';
	    }else if(score >= 80) {
	    	grade = 'B';
	    }else if(score >= 70) {
	    	grade = 'C';
	    }else if(score >= 60) {
	    	grade = 'D';
	    }else {
	    	grade = 'F';
	    }
	    System.out.println("학점은 " + grade );	
	    sc1.close();
	    
	    //A나 b이면 상,C나 D이면 중, F이면 하로 출력
	    char level;
	    if(grade == 'A'|| grade == 'B') {
	    	level = '상';
	    	
	    }else if (grade == 'C'|| grade == 'D'){
	         level = '중';
	    }else {   
	    	level = '하';
	    }
	       System.out.println("나의 레벨은 " + level );	
	    
	    //상위와 같은 내용이지만 if문 안에서 화면 출력 되게 해보자. level 변수 없이 해보자
	       
		    if(grade == 'A'|| grade == 'B') {
		    	System.out.println("나의 레벨은 상");
		    }else if (grade == 'C'|| grade == 'D'){
		    	System.out.println('중');
		    }else {   
		    	System.out.println('하');
		    }
		    
		    	
	    
	    
	    
	    
	    
		
		
	}

}
