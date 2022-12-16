package com.hanul.collection;

public class Ex83_Wrapper {

	public static void main(String[] args) {
		
		// Wrapper 클래스
		// 기본 데이터 타입(프리미티브타입)의 값을 감싼 형태로 객체를 생성해서
		// 사용하게 만드는 클래스가 있는데 이러한 클래스를 Wrapper 클래스라고 한다.
		// 프리미티브타입(직접 값을 넣는것이다.)    
		// 프리미티브타입    : byte  short  int       long    char       float   double   boolean
		// Wrapper 클래스 : Byte  Short  Integer   Long    Character   Float   Double   Boolean
		
		Byte data1 = new Byte((byte)12);
		//Byte data10 = (byte)12; // 이렇게 new로 안만들어도 자동으로 변환해준다는 뜻
		Integer data2 = new Integer(20000);
		Double data3 = new Double(3.14);
		Character data4 = new Character('봄');
		Boolean data5 = new Boolean(true);
		
		//Character처럼 문자열로 표현해줘도 된다.
		Byte data6 = new Byte("12");
		Integer data7 = new Integer("20000");
		Double data8 = new Double("3.14");
		Boolean data9 = new Boolean("true");
		
		// Wrapper 클래스를 다시 프리미티브타입으로 바꾸고 싶다면
		byte data10 = data1.byteValue();
		System.out.println(data10);
		int data11 = data7.intValue();
		System.out.println(data11);
		
		// 문자열은 레퍼런스타입(참조형)이고 숫자는 프리미티브타입이 섞여 있을때 ==> 형변환하고자 할때 형변환이 안된다.
		// 따라서 숫자를 Wrapper클래스로 변경하여 사용하면 된다
		// int a = (int)str1 이런식으로 강제 캐스팅이 안된다.str1은 레퍼런스 타입이니깐
		String str1 = "123", str2 = "321";
		System.out.println(str1 + str2); //데이터의 값이 더해져서 나오는게 아니고 123321이렇게 일렬로 나온다
		System.out.println(str1 + str2); //데이터의 값이 더해져서 나오는게 아니고 123321이렇게 일렬로 나온다
		
		// int no1 = int(str1); //이런식으로 강제 캐스팅이 안된다.str1은 레퍼런스 타입이니깐
		int no1 = Integer.parseInt(str1); //문자열이 숫자타입을 형변환 됨		
		int no2 = Integer.parseInt(str2); //문자열이 숫자타입으로 형변환 됨		
		System.out.println(no1 + no2);
		
		// int형을 String형으로 변환
		String str3 = String.valueOf(no1);
		String str4 = String.valueOf(no2);
		System.out.println(str3 + str4);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
