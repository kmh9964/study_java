package com.hanul.control;

import java.util.Scanner;

public class Ex08_if02 {

	public static void main(String[] args) {

	//if문으로 구간을 나누어 출력(높은 점수부터)
		int score = 100;
		if(score >= 90) {
			System.out.println(score + "는 90점 이상");
		}else if(score >= 80) {
			System.out.println(score + "는 80점 이상");
		}else if(score >= 70) {
			System.out.println(score + "는 70점 이상");
		}else if(score >= 60) {
			System.out.println(score + "는 60점 이상");
		}else if(score > 60) {
			System.out.println(score + "는 60점 미만");
		}	
			
		
		//if문으로 구간을 나누어 출력(높은 점수부터)
		//int score = 100;
		if(score < 60) {
			System.out.println(score + "는 60점 미만" + " E");
		}else if(score < 70) {
			System.out.println(score + "는 60점 이상" + " C");
		}else if(score < 80) {
			System.out.println(score + "는 70점 이상" + " B");
		}else if(score < 90) {
			System.out.println(score + "는 80점 이상" + " A");
		}else if(score >= 90) {
			System.out.println(score + "는 90점 이상" + " A++");
		}		
		
		
		
		if(score < 60) {
			System.out.println(score + "는 60점 미만" + " E");
        }else if(score < 70) {
			System.out.println(score + "는 60점 이상" + " C");
		}else if(score < 80) {
			System.out.println(score + "는 70점 이상" + " B");
		}else if(score < 90) {
			System.out.println(score + "는 80점 이상" + " A");
		}else {
			System.out.println(score + "는 90점 이상" + " A++");
		}		
		
		
		
		if(score < 60) {
			System.out.println(score + "는 60점 미만" + " E");
        }else if(score < 70) {
			System.out.println(score + "는 60점 이상" + " C");
		}else if(score < 80) {
			System.out.println(score + "는 70점 이상" + " B");
		}else if(score < 90) {
			System.out.println(score + "는 80점 이상" + " A");
		}else if(score <= 100) {
			System.out.println(score + "는 90점 이상" + " A++");
		}		
		
		//주민등록상 남자=>1,3(1도 되고 3도 되도 되니 or사용) 여자=>2,4
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 앞 번호(1~4) : ");//이렇게 입력할수 있는 공간이 나오게 하려면 변수 int 주기전에 이 부분이 나와야 됨
		int gender = sc.nextInt();
		if(gender == 1 || gender == 3) {
			System.out.println("남자");
		}else if(gender == 2 || gender == 4) {
			System.out.println("여자");
		}else { 
			System.out.println("입력 값 오류");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
