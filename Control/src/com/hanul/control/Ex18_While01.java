package com.hanul.control;

public class Ex18_While01 {

	public static void main(String[] args) {

		// 반복문 :일정한 작업을 규칙적으로 사용할때 사용한다.
		// 똑같은 명령문을 여러번 작성하지 않고 반목문을 사용.
		// while, do~while, for문.
		
		//Hello Java를 10번 출력하는 while문 작성해보자
		
		int cnt = 1; //초기화식
		while(cnt <= 10){//조건식이 참이면 실행, 거짓이면 빠져나옴
			System.out.println("Hello Java");	//실행문에 해당
			//조건식을 변경시켜줘야 된다. 조건식 변경이 안되면 무한루프에 빠짐, 조건식은 while조건문에 넣어줘야된다
		    cnt++;
		}
		
		
		// 1부터 10까지 출력하는 while문 만들기
		int a = 1;
		while (a <= 10 ) {
			System.out.println(a);	//실행문에 해당
			a++;
		}
			
		// 10부터 1까지 출력 while문 만들기
		int b = 10;
		while (b >= 1 ) {
			System.out.println(b);	//실행문에 해당
		    b--;	
		}
		
		// 3*1 ~ 3*6의 값이 나오게 출력 -  값이 숫자로 나오게 출력

		int c = 1;
		while (c <= 6) {
			System.out.println(3*c); 
			c++;
		}
		
		int e = 3;
		int d = 1;
		while (d <= 6) {
				System.out.println(e*d); 
				d++;
		}
		
		
		
		// "3x1" ~ "3X6" 의 문구가 나오게 출력--문자로 출력
		int no3 = 1;
			while (no3 <= 6) {
				System.out.println("3X" +no3); 
				no3++;
		}
	 
		//1부터 5까지의 합을 구하는 while문 만들기
		int no4 = 1;  //1~5까지 변해야 된다
		int sum = 0;  //총합을 저장할 변수, 처음엔 합이 없으니 0으로 초기화 값 주자
		 while (no4 <= 5) {
			 sum += no4; //sum=sum+no4; 이거와 같다.
			 no4++;
			 System.out.println(sum);//변수가 바뀔때마다 하나하나의 값을 보고 싶을때
		 }
		 System.out.println("1부터 5까지의 총합 : "+sum); // 마지막 최종값만 보고 싶으면 여기에 둘것
		
		
		 //1~100까지 합을 구하세요.
		 int no5 = 1;
		 int sum1 = 0;
		 while (no5 <= 100) {
			 sum1 = sum1 + no5;
			 no5++;
		}
		 System.out.println("1부터 100까지의 총합 : "+sum1);
		 
		 //구구단 7단 출력
		 int no6 = 1;
		 while (no6 <= 9) {
			 System.out.println("7x" + no6 + "=" + no6*7);
			 no6++;
		 }
		 
		 int no7 = 7;
		 int no8 = 1;
		 while(no8 <= 9) {
			 System.out.println("7x" + no8 + "=" + no7*no8);
			 no8++;
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
