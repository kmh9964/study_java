package com.hanul.reference;

public class Ex68_String {

	public static void main(String[] args) {

		
		// 렌퍼런스(참조) 타입은 new라는 키워드로 객체 생성을 하고 사용.
		// String 타입도 레퍼런스 타입이다.하지만 String 타입은 객체 생성없이 인스턴스화 되어, 마치 프리미티브 타입처럼 사용
		// 이유는 너무 많이 사용하기 때문에 내부적으로 처리를 해준게 된거다.
		
		String str1 = "안녕";
		String str2 = "안녕";
		
		if(str1 == str2) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		String str3 = new String (" 안녕"); //new가 붙으면 다른 객체를 생성하게 되서 서로 다른 주소를 갖게된다.
		String str4 = new String ("안녕 ");
		if(str3 == str4) { //==을 사용하게되면 주소값을 비교하게 되는것이다.
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		} 
		
		
		// 내용 비교
		if(str3.equals(str4)) { //객체의 내용이 같은지 확인할때는 equals 사용
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		} 
		
		
		if(str1.equals(str4)) { //객체의 내용이 같은지 확인할때는 equals 사용
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		} 
		
		
		str1 += "여러분";//여러분이 추가되면서 다른 주소값을 갖게 됨
		if(str1 == str2) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
		
		// 내용 비교==>trim()을 사용하게 되면 좌우 공백을 없어준다
		if(str3.trim().equals(str4.trim())) { //객체의 내용이 같은지 확인할때는 equals 사용
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		} 
		
		
		
		
		
		
	}

}
