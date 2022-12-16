package com.hanul.printwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex81_PrintWriterHome {

	public static void main(String[] args) {
		
		//homework1_본인이름 -> 폴더를 zip 파일로
		//[과제]
		// printwrite 패키지에서 studentlist.txt 파일을 만들어서 패키지에 붙여넣는다.
		// 파일형태는 성명, 성별, 연락처, 이메일
		// 홍길동,남,010-1111-1111,hanul1@naver.com
		// 심청,여,010-1111-2222,hanul2@naver.com
		// 1. 문자열 22 개를 저장할  배열변수를 선언한다.
		// 2. BufferedReader 클래스를 사용해 studentlist.txt 파일에서 
		//		데이터를 한 줄씩 읽어온(readline()) 후 
		//   읽어온 데이터를 그대로 선언한 배열변수에 저장한다.
		// 3. 문자열 배열변수에 담긴 학생목록을 표의 형식으로 출력되게 
		//   src/printwrite/list.html 파일로 저장한다.
		
		String filename = "studentlist.txt";
		File dir = new File(filename);
		if (!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		// readline()이용해서 한줄씩 읽어오기
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(filename));
			String data;
			while((data = in.readLine()) !=null) {
				System.out.println(data);
				String[] studentarr = data.split(",");
			}
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
		
		
		
		// src/printwrite/list.html 파일로 저장하기
		File dir1 = new File("src/printwrite");
		if (!dir1.exists() || !dir1.isDirectory()) {
			dir1.mkdirs();
		}
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(dir1 + "/" + "studentlist.html");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>학생 명단</h1>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	

}
