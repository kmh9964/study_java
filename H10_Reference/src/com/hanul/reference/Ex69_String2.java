package com.hanul.reference;

public class Ex69_String2 {

	public static void main(String[] args) {

		
		String str = "자바 프로그래밍 입문  ";
		int leng = str.length();
		System.out.println(leng); //문자열의 길이, 인덱스는 length-1이 값이다
		
		
		//문자열을 잘라서 일부를 리턴해주는 매소드 : substring(인덱스기준 시작점, 인덱스기준 끝점); 이다.==>	인덱스기준 끝점은 길이-1이다	
		String str1 = str.substring(3,8);//인덱스 3~7까지 자른다
		System.out.println(str1);
		
		int[] arr= {10,11,12,13,15};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String str3 = new String (" 안녕"); //new가 붙으면 다른 객체를 생성하게 되서 서로 다른 주소를 갖게된다.
		String str4 = new String ("안녕 ");
		// 내용 비교==>trim()을 사용하게 되면 좌우 공백을 없어준다
		if(str3.trim().equals(str4.trim())) { //객체의 내용이 같은지 확인할때는 equals 사용
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		} 
		
		//문자열 연결 매소드 : concat(붙이고자하는 문자열 변수);
		String str5 = "  Do it";
		str5 = str5.concat(str);
		System.out.println(str5);
		
		System.out.println(str5.trim());//이렇게 하면 공백이 없어지는건 일회성이다
		String str100 = str5.trim();// 계속 공백을 없애고 싶으면 변수에 넣어줘야 된다.
		System.out.println(str100);
		
		
		//영문자에 대한 대/소문자화 매소드 :  toUpperCase()/toLowerCase()
		System.out.println(str5.toUpperCase());//일회성이다
		System.out.println(str5);//계속 바꾸려면 변수에 넣어주자
		
		System.out.println(str5.toLowerCase());//일회성이다
		System.out.println(str5);//계속 바꾸려면 변수에 넣어주자
		
		System.out.println(str5.toLowerCase().trim());//일회성이다, 좌우 여백 없어주고 소문자로 바꾸는거
		System.out.println(str5.trim().toLowerCase());//일회성이다, 좌우 여백 없어주고 소문자로 바꾸는거
		
		//문자열 변경 배소드 : replace(기존 문자열, 변경할 문자열)
		String str6 = " Hi Hanul";
		str6 = str6.replace("Hi","Hello");//Hi를 Hello로 바꿔라(문자열 가능)
		System.out.println(str6);
		str6 = str6.replace("H","A");//H를 A로 바꿔라(문자개당 가능)
		System.out.println(str6);
		
		//위의 것들을 한줄로 표현해보자
		String str7 = " Hi Hanul";
		str7 = str7.replace("Hi","Hello").replace("H","A").substring(0,10).trim();
		System.out.println(str7);
		
		// 문자열에서 특정 문자열의 시작위치의 인덱스를 리턴하는 매소드
		//: indexOf()==>왼쪽부터 오른쪽으로 시작, lastIndexOf()==>맨 마지막문자부터 시작해서 왼쪽으로 가는것
		String str8 = "문자열에서 특정 문자나 문자열이 있는 시작위치를 리턴";
		// 왼쪽부터 시작해서 "문자열" 이라는 문자열의 시작위치를 index로 알려준다.
		System.out.println(str8.indexOf("문자"));//index라서 0부터 시작한다고 나옴
		int idx1 = str8.indexOf("문자");
		idx1 = str8.indexOf("문자",idx1+1);
		System.out.println(idx1);
		idx1 = str8.indexOf("문자",idx1+1);
		System.out.println(idx1);
		// 오른쪽부터 시작해서 "문자" 라는 문자열의 시작위치
		System.out.println(str8.lastIndexOf("문자"));
		// 특정위치(왼쪽 6위치)부터 시작해서 "문자" 라는 문자열의 시작위치
		System.out.println(str8.indexOf("문자",6));
		
		//split( )문자열을 잘라서 출력하는것,()안의 내용으로 잘라서 보내는것
		String str10 = "안녕,나는,홍길동이야";
		String[] arr2 = str10.split(",");
		
		for(String str11 : arr2) {//향상된 for문은 배열변수만 사용 가능,for문에 for( 데이터타입 변수:배열변수)만 세팅하면 된다.
			System.out.println(str11);//
		}
		
		String str12 = "안녕 나는 홍길동이야";
		String[] arr3 = str12.split(" ");
		for(String str13 : arr3) {//향상된 for문
			System.out.println(str13);
		}
		//향상된 for문
		int intArray[] = {1,2,3,4,5};
		for(int number : intArray) {
			System.out.println(number);
		}
		String str20 = "선경 기업 화이팅";
		String[] str21 = str20.split(" ");
		for(String str19 : str21 ) {
			System.out.println(str19);
		};
		String[] strA = {"선경","기업","화이팅!!"};
		for(String strB : strA) {
		System.out.println(strB);
	
		}
		
		
		
		
		
		
		
		
		
		
	}

}
