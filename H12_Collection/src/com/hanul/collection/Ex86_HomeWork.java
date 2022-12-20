package com.hanul.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Ex86_HomeWork {
	
	public static void main(String[] args) {
	
	// Homework1_본인이름 -> 폴더를 zip파일로 만들어 이름을 붙인후 제출
	// [과제]
	// 1. 	BufferedReader 클래스를 사용해 list.txt 파일에서 한 줄씩 읽어온 데이터를 
	//		Student 객체 로 만들어 자료구조 HashMap 에 데이터로 저장한다.
	// 2. 	저장을 모두 끝낸 후 자료구조에 있는 학생목록에서 학생의 정보를 찾아 
	// 		다음처럼 출력되게 한다.
	// for문과 if문 이용해서 할것
	
	// 출력결과) : 자기자신의 정보를 출력해보세요
	// 성명: 최선
	// 성별: 여
	// 연락처: 010-230-0320
	// 주  소: chltjs@naver.com
	
	
	HashMap<String,Ex85_1_Student> studentList = new HashMap<>();
	BufferedReader in = null;
	try {
		in = new BufferedReader(new FileReader("list.txt"));
		String data;
		    //readLine()를 이용해서 한줄씩 읽어온다
		while((data = in.readLine()) !=null) {
			//System.out.println(data);
			// 한줄씩 가져온 데이터를 ,(쉼표)를 기준으로 자른다.
			String[] studentarr = data.split(",");
			//배열 순서에 따라 잘라진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 student를 생성해서
			studentList.put(studentarr[0],new Ex85_1_Student(studentarr[0], studentarr[1], studentarr[2], studentarr[3]));
			
		}
		for(Ex85_1_Student student : studentList.values()) {
			if(student.getName().equals("강미화")) {
				System.out.println("성명:" + student.getName());
				System.out.println("성별:" + student.getGender());
				System.out.println("연락처:" + student.getPhone());
				System.out.println("이메일:" + student.getEmail());
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	}	
	
}
