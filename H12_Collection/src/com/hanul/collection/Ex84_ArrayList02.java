package com.hanul.collection;

import java.util.ArrayList;

public class Ex84_ArrayList02 {

	public static void main(String[] args) {
		// 모든 자료 구조는 레퍼런스타입(참조타입)만 저장이 가능하다.
		// 프리미티브타입의 데이터를 자료구조에 저장할때는 Wrapper클래스를 사용한다.
		ArrayList<Integer> list = new ArrayList<>();
		Integer a = new Integer(10);
		list.add(a);
		list.add(new Integer(20));
		int b = 25;
		list.add(b); //int타입이 위에서 Integer타입으로 한번 선언해서 자동 변환 됨
		list.add(30);
		for(int aa : list) {
			System.out.print(aa + " ");
			
		}System.out.println();
		
		
		
		
		
		
		
	}

}
