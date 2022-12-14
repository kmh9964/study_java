package com.hanul.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex72_FileReader {

	public static void main(String[] args) {
		
		//외부 문서를 가져와서 읽어들이는 방법
		
		FileReader reader = null;//객체를 생성
//		try {//외부문서를 가져오는 것이어서 try~catch해준다
//			reader = new FileReader("reader.txt");//reader.txt내가 읽을 파일명
//			while(true) {				
//				
////					int data;
////					while((data=reader.read()) != -1 ) {//-1은 파일이 끝났다는 뜻
////						char ch = (char) reader.read();
////						System.out.println(ch);
////					}
//					int data = reader.read();//문자는 숫자로 변환 시켜서 저장시키기 때문에 int로 받아서
//					if(data == -1) {
//						break;
//					}
//					char ch = (char) reader.read();//char로 다시 받아줘야 된다
//					System.out.println(ch);
//					
//								
//			}
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}finally {
//			try {
//				reader.close();				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
		try {
			reader = new FileReader("reader.txt");
			char[] data = new char[100];
			try {
				int no = reader.read(data);
				System.out.println(no);
				for(int idx=0; idx<no; idx++) {
					System.out.println(data[idx]);
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

	}


