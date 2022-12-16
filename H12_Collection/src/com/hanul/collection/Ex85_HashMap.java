package com.hanul.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex85_HashMap {

	public static void main(String[] args) {

		// HashMap<Key,Value> 형태로 저장
		// 저장공간을 key별로 구분하여 저장하기 때문에 접근 속도가 빠르다.
		
		// 사람이름을 키값으로 넣을거니깐 String, 성적을 키값에 대한 데이터로 받을거니깐 Integer로  변수 선언과 초기값 선언
		//HashMap<String, Integer> map = new HashMap<>(30);  이렇게 저장 크기를 정해줘도 된다
		HashMap<String, Integer> map = new HashMap<>();
		
		//데이터 저장 : put(키값 , 키값에 해당하는 데이터); ==> put(이름,영어점수)로 줄때
		map.put("홍길동", 88);
		map.put("심청",90);
		map.put("전우치", 85);
		map.put("박문수", 98);
		
		//데이터 조회 :  get(키값);
		int score = map.get("심청");
		System.out.println(score);
		
		//데이터 삭제  :remove(키값);
		map.remove("전우치");
		//score = map.get("전우치");
		//System.out.println(score);//전우치에 대한 데이터가 지워져서 null이 나오면서 에러가 나온다.
		
		
		//
//		HashMap<String,Ex85_1_Student> studentList = new HashMap<>();
		
		
		//먼저 class Student를 만들어두고 list.txt를 만들어둔 후 아래처럼 실행한다
		//여기에선 클래스 Ex85_1_Student를 만들어두고, list.txt를 만들어서 학생들의 정보를 넣어뒤 저장해뒀다. 
		ArrayList<Ex85_1_Student> studArraylist = new ArrayList<>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("list.txt"));
			String data;
			    //readLine()를 이용해서 한줄씩 읽어온다
			while((data = in.readLine()) !=null) {
				System.out.println(data);
				// 한줄씩 가져온 데이터를 ,(쉼표)를 기준으로 자른다.
				String[] studentarr = data.split(",");
				//배열 순서에 따라 잘라진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 student를 생성해서
				//ArrayList(student)에 add를 이용해서 넣는다
				studArraylist.add(new Ex85_1_Student(studentarr[0],studentarr[1],studentarr[2],studentarr[3]));
				
			}
			System.out.println("리스트 사이즈 : " + studArraylist.size());
			System.out.println();
		    System.out.println(studArraylist.get(0).getName());
		    System.out.println(studArraylist.get(1).getGender());
		    System.out.println(studArraylist.get(2).getPhone());
		    System.out.println(studArraylist.get(2).getEmail());
		    System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("읽기 끝");
		
		
		
		
		
		
		
		
		
	}

}
