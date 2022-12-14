package com.hanul.operator;

import java.util.Scanner;

public class Ex06_Operaor {

	public static void main(String[] args) {

		//대입연산자 = 는 오른쪽에 있는 것을 왼쪽에 넣는다는 개념.
		int no1 = 10;
		System.out.println(no1);
		
		String name = "강미화";
		System.out.println("나의 이름은 "+ name);
		
		
		char ch = '봄';
		System.out.println(ch);
				
		int no2 = (no1=5) + 10;//이런방식은 단순하지가 않고, 명확하지 않아서 추천하지 않는다.
		System.out.println(no2);
		
		
		int no3 = no2 = no1;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		System.out.println("no1의 값은 "+ no1 +"이다.");//
		
		//산술 연산자 : +, -, *, /(나누기 한 다음에 몫만 나옴), %(나누기 한 다음에 나머지만 나옴)
		no2 =7; no3 = 3; //;이 문장의 끝을 의미하므로 여러개 나열도 가능
		System.out.println(no2 + no3);
		System.out.println(no2 - no3);
		System.out.println(no2 * no3);
		System.out.println(no2 / no3);
		System.out.println(no2 % no3);
		
		double no4 = 2.0; //int형 no2보다 double형 no4가 더 큰 타입이라 double형으로 프린트
		no4 = no2 / no4;
		System.out.println(no4);
		
		
		//사칙연산 우선순위를 인위적으로 지정하려면 ()를 사용하면 된다.
		no1 = 7 / 2 + 3;
		System.out.println(no1);
		
		no1 = 7 / (2 + 3);
		System.out.println(no1);
		
		//int no5 = 100 + 200L;  이때는 에러가 난다. int형과 Long형이 만나서
		int no5 = (int) (100 + 200L); //int형으로 맞춰줌
		System.out.println(no5);
		
		byte no6 = 2, no7 = 3, no8;
		no8 =(byte) (no6 + no7);
		System.out.println(no8);
		
		no1 =-no1;
		no6 =(byte) +no6;//+1 *no6 이어서 +1이 int형 no6의 byte형에 맞게 캐스팅이 필요
		System.out.println(no1);
		System.out.println(no6);
		
		
		//증감(증감/감소) 연산자 : ++, --
		//++변수 : 먼저 변수에서 1을 더한 후 사용한다 (선증감)
		//변수++ : 변수가 사용된 후에 변수에서 1을 더한다 (후증감)
		//--변수 : 먼저 변수에서 1을 감소한 후 사용한다 (선감소) 
		//변수-- : 변수가 사용된 후에 변수에서 1을 감소한다 (후감소)
		
		int su = 5, result;
		result = ++su;
		System.out.println("result:" +result + ", su:" + su );
		result = su++;
		System.out.println("result:" +result + ", su:" + su );
		result = --su;
		System.out.println("result:" +result + ", su:" + su );
		result = su--;
		System.out.println("result:" +result + ", su:" + su );
		
//		int a = 1, b = 3, sum;
//		sum  = a +  ++b;
//		System.out.println(sum);
//		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
//	
		
		
		double no9 = 123.012456;
		System.out.printf("%8.2f, %-8.2f, %.3f \n", no9, no9, no9);
	    // %+8.2f는 +때문에 우측 정렬이면서 소숫점은 2개까지 나오게 하라는 뜻
		
		// 관계(비교)연산자 : >, <, <=, >=, ==(같다), !=(같지않다)
		// boolean로 강제 캐스팅 되어 true 또는 false 값으로 나타난다
		
		System.out.println("10 > 5?" +(10>5));
		boolean isResult = (10<=5);
		System.out.println("10>5?" + isResult);
		isResult = (10 != 5);
		System.out.println("10 ! = 5? " + isResult);
		
		
		// 논리연산자 : &&(and 논리곱),||(or 논리합), !(not 연산자)
		// && : 연산자 좌, 우 모두 참(true)이어야 참(true)이고, 나머지는 거짓(false)
		// || : 연산자 좌, 우 중 하나만 참(true)이어도 참(true), 양쪽 모두 거짓일때만 거짓(false)
		
		System.out.println(10>5 && 20>5); //이것의 값은 true가 된다
		System.out.println(10>5 && 20<5); //이것의 값은 false가 된다
		System.out.println(10<5 && 20>5); //이것의 값은 false가 된다
		System.out.println(10<5 && 20<5); //이것의 값은 false가 된다
		
		System.out.println(10>5 || 20>5); //이것의 값은 true가 된다
		System.out.println(10>5 || 20<5); //이것의 값은 true가 된다
		System.out.println(10<5 || 20>5); //이것의 값은 true가 된다
		System.out.println(10<5 || 20<5); //이것의 값은 false가 된다
		
		int num1 = 5, num2 = 2, num3 = 5, num4 = 10;
		System.out.println(num1==num2 || num1==num3 && !(num3>num4));
		
		
		//복합연산자 : +=,-=,*=,/=,%=
		//a = a + b => a += b
		//a = a - b => a -= b
		//a = a * b => a *= b
		//a = a / b => a /= b
		//a = a % b => a %= b
		 
		int num = 29;
		num -= 2 + 3 * 4; // num = num-(2+3*4)
		System.out.println(num);
		
		//삼항 연산자(조건연산자) : a ? b:c =>a 조건문이 되고 조건문 a가 참이면 b로 실행,a가 거짓이면 c로 실행
		int num5 = 10;
		System.out.println("num5 == 10? " + (num5 == 10? "참":"거짓"));
		System.out.println("num5 == 10? " + 
		(num5 < 10? "10보다 큼":num5==10? "10과 같음":num<10? "10보다 작음":"끝"));
		
		
		//과제 :  13을 짝수 /홀수 출력하기
		//13을 int 형으로 초기화
		//삼항연산자를 써서 짝수인지 홀수인지 출력하세요.
	    int num6 = 13;
	    System.out.println("num6%2==0? " +(num6%2 == 0 ?"짝수" : "홀수"));
	    
		//과제 : 성적에 따른 학점 출력하기
	    //90점 이상이면 A, 80점 이상이면 B, 70점 이상이명 C, 그 외에는 D로 출력
	    //int 타입으로 jumsu로 변수 98점으로 초기화
	     int jumsu= 98;
	    System.out.println("미화의 학점은 ? " + 
	    		(jumsu >= 90? 'A': jumsu >= 80? 'B': jumsu >= 70? 'C':'D'));
	    		
		//입력 받는 class
//		Scanner sc = new Scanner(System.in);
		/*System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		System.out.println(score);
		

		//입력 받은 수가 짝수인지 홀수인지 출력, 삼항연산자를 이용해서
		System.out.println("점수가 짝수인가 홀수인가? "+(score%2 == 0 ?"짝수" : "홀수"));
		*/
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("학생의 점수를 입력해 주세요 : ");
	    int grade =sc.nextInt();
		System.out.println("미화의 학점은 ? " + 
	    		(grade >= 90 ? 'A': grade >= 80 ? 'B': grade >= 70 ? 'C':'D'));
		
		
//		int a = 1, b = 3, sum;
//		sum  = a +  ++b;
//		System.out.println(sum);
//		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
	
		
		
		
	
	}

}
