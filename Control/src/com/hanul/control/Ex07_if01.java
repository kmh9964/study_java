package com.hanul.control;

public class Ex07_if01 {

	public static void main(String[] args) {

		
		// if만 사용 가능 ==> if(조건문) : 조건문이 참이면 실행, 중괄호 안에 있는 내용은 다 실행
		// if와 else 사용 가능 ==> 조건문이면 참이면 if문을 실행, 아니면 else문 실행
		// if와 else if와 ......else를 사용 가능==> 조건식이면 참이면 실행, 아니면 else문 실행
		
		
		int no1 = 15, no2 = 10;
		if(no1 > no2) {
			System.out.printf("%d 가 %d보다 더 큰수 \n", no1, no2);
		}else {
			System.out.printf("%d 가 %d보다 더 크거나 같은수 \n", no2, no1);
		}
		
		
/*		if(no1 <= no2) {
			System.out.printf("%d 가 %d보다 더 크거나 같은수 \n", no2, no1);
		}  조건문이 false이기 때문에 실행이 안됨
*/	
//		int dadAge = 54, mamAge = 56;
//		//만약의 아빠나이가 엄마 나이보다 많으면 if(조건문)가 실행
//		//if조건문이 false 만약에 엄마나이가 아빠나이보다 많으면 else if(조건문)실행
//		//둘의 나이가 같으면 else가 실행. else는 조건문이 없음,마지막 else문은 없어도 된다.
//		if (dadAge > mamAge) {
//			System.out.println("아빠나이가 엄마나이보다 많다 . 아빠나이 : "+ dadAge);
//		}else if(dadAge < mamAge) {
//			System.out.printf("엄마나이 %d이 아빠나이 %d보다 많다. \n", mamAge,dadAge);
//		}else { 
//			System.out.printf("엄마 나이와 아빠 나이가 같다");
//			
//		}
//		
		
		int even = 50, odd = 51;
		//even 이라는 수가 짝수인지 홀수인지 판단하여 출력
		if(even%2 == 0) {
			System.out.println("짝수");
		}else if (even%2 == 1) {
			System.out.println("홀수");
		}
		
		if(even%2 == 0) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		
		//odd 이라는 수가 짝수인지 홀수인지 판단하여 출력
		if(odd%2 == 0) {
			System.out.println("짝수");
		}else if (odd%2 == 1) {
			System.out.println("홀수");
		}
		
		if(odd%2 == 0) {
			System.out.println("짝수");
		}else  {
			System.out.println("홀수");
		}
		
		//택시를 타려면 돈이 3300원 이상 있어야 됩니다.
		//집에서 한울까지 택시를 타면 15분이 걸리고, 버스를 타면 30분이 걸립니다.
		//지각 12번 이상시 수당을 못 받는다.
		//나는 지금 11번 지각을 했다.
		
		int myMoney = 200;
		int arrivedTime;
		int late = 11;   //지각까지는 25분 남음
//		if(myMoney >= 3300) {
//			System.out.println("택시를 탄다");
//			arrivedTime = 15;
//		}else {
//			System.out.println("버스를 탄다");
//			arrivedTime = 30;
//			late++; //late = late+1이라고 해줘도 late++과 결과 값이 같다
//		}
//		 System.out.println(myMoney +"," + arrivedTime + "," + late );
//		
//				 
		 /*int myMoney = 2000;
		 int arrivedTime;
		 int late = 11; */
		 int busMoney =1250, taxiMoney =4200;
		 
		 if(myMoney >= 4200) {
			System.out.println("택시를 탄다");
			arrivedTime = 15;
			myMoney = myMoney-taxiMoney;
		  }else if(myMoney > 1250) {
				System.out.println("버스를 탄다");
				arrivedTime = 30;
				late++;
				myMoney = myMoney-busMoney;
		  }else {	
			  System.out.println("걸어간다");
			  arrivedTime = 60;
			  late++;
		  }		
		 System.out.println(myMoney +"," + arrivedTime + "," + late );
		
		 if (late >=12) {		
			System.out.println("수당 미지급");
		 }else {
			 System.out.println("수당 지급");
		 }
		 
		 
		 
		 //if문 안에 if문 작성 가능
//		int dadAge = 56, mamAge = 56; 
//		if (dadAge > mamAge) {
//			System.out.println("아빠나이가 엄마나이보다 많다. 나이차이 : "+ dadAge);
//		}else {
//			if(dadAge < mamAge) {
//				System.out.printf("엄마나이가 아빠나이보다 많다. 엄마 나이: ",+ mamAge);
//		}else { 
//			System.out.printf("엄마 나이와 아빠 나이가 같다");
//			  }	
//			}
//			
		
		int dadAge = 52, mamAge = 56; 
		int age;
		
		if (dadAge > mamAge) {
			age = dadAge-mamAge;
			System.out.println("아빠나이가 엄마나이보다 많다. 나이차이 : "+ age);
		}else {
			if(dadAge < mamAge) {
			age = mamAge-dadAge;	
				System.out.printf("엄마나이가 아빠나이보다 많다. 나이차이: "+ age);
		}else { 
			System.out.printf("엄마 나이와 아빠 나이가 같다");
			  }	
			}
			
		
		
		
		
		
	}

}
