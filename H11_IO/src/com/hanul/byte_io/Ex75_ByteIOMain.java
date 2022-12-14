package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex75_ByteIOMain {

	public static void main(String[] args) {
		// 키보드로 구구단 단 수를 입력받아 입력받은 단의 결과값을 배열변수에 담는다.
		// 예) 3단 : 3, 6, 9, 12, 15, 18, 21, 24, 27
		
		// 스캐너로 입력 받는 매소드
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단? ");//몇단을 할지 입력한 뒤 실행하면 계속적으로 파일이 만들어지고 아래에선 읽어온다
		int dan = sc.nextInt();
		sc.close();
		
		// 구구단 for문
		byte data[] = new byte[9];
		for(int by=1; by<=9; by++) {
			data[by-1] = (byte)(dan*by);  // 0-8 까지 인덱스에 값이 들어감
		}

		// 배열에 담긴 데이터(입력받은 구구단 결과값)를 3단.dat 파일에 쓰기작업을 한 후 
		// 3단.dat 파일의 내용을 읽어들여 출력하시오.
		String filename = dan + "단.dat";//파일명을"단.dat"로 한다는 뜻,(dan ==>위에서 입력 받은수를 넣을 변수)
		FileOutputStream out = null;//출력할 변수 값 초기화
		
		try {
			out = new FileOutputStream(filename);
			out.write(data);//위에서 구구단 변수 data를 넣어서 출력해라라는 뜻.		
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("바이트 파일 쓰기 완료");
		
		//파일에 들어있는 내용 입력받ㄱ;ㅣ
		System.out.println("파일 내용 읽기");
		FileInputStream in = null;
		try {
			in = new FileInputStream(filename);//filename은 dan + "단.dat" 파일 이름을 담은 변수다
			int no;
			while((no = in.read()) != -1) {
			//int no의 값이 파일에서 읽어온 읽어온 수가 들어온다.
			//입력 스트림으로부터 바이트를 읽을 수 없다면 read()-1과 같아지면 while문을 빠져나온다.
				System.out.println(no);//in.read()한 값이 int no에 저장됐으므로 그걸 출력해보자
			}			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		

	}

}
