package com.hanul.control;

public class Ex23_For02 {

	public static void main(String[] args) {

		//구구단을 2~9단까지 중첩 for문으로 출력
		for(int dan=2; dan<=9; dan++) {
			System.out.println("--- " + dan +" 단"+ " ---");
			for(int i=1; i<=9; i++) {
				System.out.printf(" %d x %d = %d\n",dan,i,dan*i);
			}
			System.out.println();
		}
			
		// 구구단을 가로로 출력
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("--- %d단 ---\t",dan);//
		}
		    System.out.println();
		    
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d x %d = %d\t",dan,i,dan*i);
			}
			System.out.println();
		}
		
		// 다중 for문을 이용하여 아래와 같이 출력
		// ****
		// ****
		// ****
		// ****
		// ****
		for(int i=1; i<=5; i++){
			System.out.println("****");		
//			for(int a=1; a<=4; a++) {
//				System.out.print("*");
//				
//			}
		}System.out.println();
		
		for(int i=1; i<=5; i++){			//출력시 위에서 아래로 총 5칸
			for(int a=1; a<=4; a++) {		//출력시 옆으로 4칸
				System.out.print("*");
			}
			System.out.println();			//줄바꿈을 해줘야 4개씩 찍힌 뒤 줄이 바껴서 아래로 내려와서 또 4개가 출력
		}
		System.out.println();			
		
		//*****
		//****
		//***
		//**
		//*
		//*하나가지고 다중 for문 
		int a, i;
	    for(a=0; a<5; a++) {
	    	for(i=0; i<5-a; i++) {
	    		System.out.print("*");
	    	}
	    	
	    	
	    	System.out.println();
	    }
		
	    	// *
	 		// **
	 		// ***
	 		// ****
	 		// *****
	    System.out.println();
	   
	    for(int b=1; b<6; b++) {
	    	for(int c=0; c<b; c++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    	
	    	
		
	    System.out.println();
	    for(int b=1; b<6; b++) {
	    	for(int c=1; c<7-b; c++) {
	    		System.out.print("*");
	    		
	    	}
	    	System.out.println();
    	}
	}
	
	.

}
