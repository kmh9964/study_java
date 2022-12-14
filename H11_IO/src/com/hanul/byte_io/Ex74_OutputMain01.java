package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex74_OutputMain01 {

	public static void main(String[] args) {
		
		//byte형식을 써서 저장하는 방법(출력스트림)
		FileOutputStream out = null;
		
		try {
			//writer 파일 객체 선언
			out = new FileOutputStream("output.dat");
			byte [] data = {0,1,2,3,4,5,6,7,8,9};
			out.write(data);//write(byte[] data) 매소드 사용해서 매개값으로 주어진 배열 data의 모든 byte를 출력한다.
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

		
		//byte 형식의 자료를 읽어올때(입력스트림)
		FileInputStream in = null;
		try {
			in = new FileInputStream("output.dat");//output.dat는 읽어오고자하는 문서 명
			int data;
			while((data = in.read()) != -1) {//-1는 문서 끝까지를 뜻함, 읽어오는 데이터가 -1과 같지 않을때는 반복을 멈춰라라는 뜻
				System.out.println(data);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		
	}

}
