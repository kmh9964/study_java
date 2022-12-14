package com.hanul.reference;

public class Ex71_StringBuilder {

	public static void main(String[] args) {
		
		// StringBuilder는 여러 String과 문자열을 더할때 새로운 객체를 생성하는 것이 아니고,
		// 있는것에 더하는 방식으로 이뤄지기때문에 속도도 빠르고, 상대적으로 부하가 적다
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//capacity() 용량을 알아보는 명령
		
		sb = new StringBuilder("안녕");
		System.out.println(sb.capacity() + sb.length());//capacity() 용량을 알아보는 명령,length()길이를 알아보는
		
		String str = "여러분" + "안녕" + "~";//이건 상대적으로 용량이 많이 쓰임
		sb = new StringBuilder();//위의 내용을 이렇게 쓰면 상대적으로 메모리 낭비가 줄어든다
		sb.append("여러분");//StringBuilder에서 append()는 문자열을 더하는 역할을 한다.
		sb.append("안녕");
		sb.append("~");
		System.out.println(sb);
		
		String val = sb.toString();// append()한 내용,즉 만들어진 문자열을 출력하기 위해선 toString()를쓴다.변수에 담아서 써야된다
		System.out.println(val);
		
		
		

	}

}
