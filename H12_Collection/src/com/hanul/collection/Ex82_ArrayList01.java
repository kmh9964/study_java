package com.hanul.collection;

import java.util.ArrayList;

public class Ex82_ArrayList01 {

	public static void main(String[] args) {
		
		// 자료 구조:메소드가 제공 된다.==> add, get,set,remove,indexOf
		// 여러 데이터타입을 모아둔 데이터 그룹으로 데이터의 검색, 추가, 삭제, 변경이
		// 가능하도록 만들어지 논리적 구조
		// 필드의 데이터 타입을 클래스 선언 시 결정하지 않고, 객체 생성시 결정한다.
		// ArrayList<구조체>,HashMap<K,V>
		// 처음엔 디폴트로 10개의 저장공간이 생긴 후 더 필요하면 알아서 저장공간을 더 준다.
		
		//변수 선언
		ArrayList<String> list = new ArrayList<String>();//String형태의 ArrayList를  list 변수를 선언함, 임포트 해주자
//		ArrayList<String> list = new ArrayList<String>(5);//new ArrayList<String>(5);==>숫자 5는 5개의 데이터를 저장한다는 뜻
		
		// 데이터를 저장 :add() ==>변수.add("데이터");
		list.add("배"); //list의 인덱스 0번째에 삽입
		list.add("사과"); //list의 인덱스 1번째에 삽입
		list.add("귤"); //list의 인덱스 2번째에 삽입
		list.add("수박"); //list의 3번째에 삽입
		list.add("파인애플"); //list의 4번째에 삽입
		
		//리스트에 몇개의 자료가 들어있는지 알고 싶을때:size(); ==>반복문할때 사용하면 좋다
		System.out.println(list.size());
		
		//조회 : get(인덱스);
		for(int i=0; i<list.size(); i++) {
			String fruit = list.get(i);
			System.out.print(i + ":" + fruit +"\t");
		}
		System.out.println(); //줄바꿈용
		//인덱스를 사용하지 않을때는 향상된 for문 사용하면 된다
		for(String fruit : list) {
			System.out.print(fruit + " ");
		}
		System.out.println(); //줄바꿈용
		//printList(list); //메소드 사용해도 된다
		
		
		
		// 테이터 삽입: 특정 위치에 넣는것. 저장하는 add하고는 다르다
		// add(삽입할 인덱스, 데이터); ==>add(몇번째에 삽입할지 인덱스, 어떤 내용을 쓸지);
		// 삽입하게 되면 원래 있던 내용은 뒤로 밀려서 저장
		list.add(1,"바나나");
		printList(list);//아래에서 만든 printList(); 매소드 사용
		
		// 데이터 변경 저장 : set(변경할 인덱스,변경할 데이터); ==> 인덱스 자리에 있던 데이터가 내가 변경하고자하는 데이터로 변경 됨.
		list.set(4, "단감");
		printList1(list);//아래에서 만든 printList(); 매소드 사용
		
		// 데이터 삭제 : remove(삭제할 인덱스); 또는 remove(삭제할 데이터);
		list.remove(2);
		list.remove("파인애플");
		printList1(list);//아래에서 만든 printList(); 매소드 사용
		
		// 데이터의 위치 찾기 :  indexOf(데이터);
		int idx = list.indexOf("귤");//찾는 데이터 해당하는 첫번째 인덱스 위치를 보여준다
		System.out.println(idx);
		
		list.add("배"); // "배" 데이터를 삽입
		idx = list.lastIndexOf("배");//찾는 데이터 해당하는 마지막 인덱스 위치를 보여준다
		System.out.println(idx);
		
		
		
		
		
		
		
		
		

	}
	
		//출력할 내용이 계속 반복되므로 메소드 만들어서 사용하기로 함
		public static void printList(ArrayList<String> list) {
		for(int i=0; i<list.size(); i++) {
			String fruit = list.get(i);
			System.out.print(i + ":" + fruit +"\t");
		}
		System.out.println();//줄바꿈용
		}
		
		//인덱스를 사용하지 않을때는 향상된 for문 사용하면 된다
		public static void printList1(ArrayList<String> list) {
		for(String fruit : list) {
			System.out.print(fruit + " ");
		}
		System.out.println();
		}
		
		
}

