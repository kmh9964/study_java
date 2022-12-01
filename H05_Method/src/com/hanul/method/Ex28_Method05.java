package com.hanul.method;

public class Ex28_Method05 {

	public static void main(String[] args) {

		//배열은 참조형이다
		//선언하는 방법 --> 데이터타입[인덱스 숫자] 변수명;
		//선언하는 방법 --> 타입 변수명[인덱스 숫자];-->[인덱스] 안의 숫자보다 1작은 수만큼 생김. 예를 들어 [3]이라면 0,1,2
		//인덱스는 0부터 시작함.
		//[실습문제]학생들의 성적에 대한 평균과 학점을 출력하는 매소드 선언하여 사용하기
		
		int[] parkJumsu = {81, 84, 95,100,85};
		int[] simJumsu = {96,92,84};
		int[] hongJumsu = {80,76,82};
		
		float avg,avg1,avg2;//평균
		char grade,grade1, grade2; //학점
		
		//학생들의 평균과 학점 출력해보자
	    avg = averageOfScore(parkJumsu);
	    grade = gradeOfAverage(avg);
	    System.out.printf("박문수의 평균은 %.2f 이고 학점은 %c 이다\n", avg , grade);
	    
	    avg1 = averageOfScore(simJumsu);
	    grade1 = gradeOfAverage(avg1);
	    System.out.printf("심청이의 평균은 %.2f 이고 학점은 %c 이다\n", avg1 , grade1);
		
	    avg2 = averageOfScore(hongJumsu);
	    grade2 = gradeOfAverage(avg2);
	    System.out.printf("홍길동의 평균은 %.2f 이고 학점은 %c 이다\n", avg2 , grade2);
	    
	    
	    
		
	    printscore(parkJumsu,"박문수");
	    
	    
	}

	
	
	// 성적 평균 구하기 매소드 만들기
	// 받은값:학생의 점수, 리턴할값:평균
	static float averageOfScore(int[] Jumsu) {  //parkJumsu의 배열을 매개변수로 갖는다는 뜻 
		float avg =0.0f;  //평균값은 실수형으로 나올수 있으니 float 데이터 형식으로 선언.
		int sum = 0;      //총점은 정수이므로 int형
		for(int i=0; i<Jumsu.length; i++) {  //parkJumsu.length는 parkJumsu의 인덱스 길이를 보여주는 것
			sum = sum + Jumsu[i]; //parkJumsu 배열의 값을 넣어가면서 반복을 한다는 뜻
		}
		avg = sum/(float)Jumsu.length; //평균값은 총 점수/과목수니깐 => parkJumsu.length가 과목수이므로 sum을 이걸로 넣어줌
		return avg;                        // avg가 flaot데이터 형식이니 강제로 (flaot)캐스팅 해줌
		
	}
	
	// 성적 평균의 학점 구하기 매소드 만들기
	//받은값 :평균 , 리턴할값 : 학점-->캐릭터 데이터 형식
	 static char gradeOfAverage(float avg) {
		 char grade;
		if(avg >= 90) {
			grade = 'A';
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	 }
		 
//		//이름이랑 점수 프린트하는 부분을 매소드로 만들어보기
//	 static void printscore(int[] jumsu, String name) {
//		   //성적구하기 매소드 이용
//		   float avg = averageOfScore(jumsu);
//		   //평균 이용해서 학점 구하는 매소드 이용
//		   char grade = gradeOfAverage(avg);
//		    System.out.printf("%s의 평균은 %.2f 이고 학점은 %c 이다\n",name, avg , grade);
//		    
//		    
//	 }
		 
	static void printscore(int[] jumsu, String name) {
		float avg = averageOfScore(jumsu);
	    char grade = gradeOfAverage(avg);
	    System.out.printf("%s의 %.2f 이고 학점은 %c 이다\n", name,avg , grade);
	}
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
}
