package com.hanul.buffer_io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex77_BufferedRWMain {

	public static void main(String[] args) {
		
		
		String filepath1 = "src/buffer_io";	//파일 경로를 지정
		File dir = new File(filepath1);
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		String filename = filepath1 + "/buffered.txt";//텍스트 파일로 저장
		//쓰기
		BufferedWriter out = null;//buffer(임시저장소?)에서 출력하는 변수의 초기값
		try {
			out = new BufferedWriter(new FileWriter(filename));
			char data[]= {'안','녕','!','\n','오','늘','도','\n','즐','거','운','하','루','\n'};
			out.write(data);
			out.flush();//버퍼가 다 채워지지 않더라도 잔류하는 모든 데이터를 출력해라.
		} catch (Exception e) { //Exception총체적으로 예외처리 해라. 이걸로 선택
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("쓰기 끝");
		
		
		//읽기(입력 :InputStream 사용)
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
			int data;
			while((data = (char)in.read()) !=-1) {
				System.out.println((char)data);
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
		
		
		
		

	}

}
