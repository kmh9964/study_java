package com.hanul.printwrite;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex78_PrintWriter {

	public static void main(String[] args) {
		
		//PrintWriter
		//다양한 타입의 출력에 특화된 문자 스트림 클래스로 자동 flush()기능을 제공한다
		//데이터를 포맷해서 파일로 출력할 때 사용한다.
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("report.txt");//아직 만들어지지 않은 report.txt에 아래 내용을 넣어라
			writer.println("------- 성적표 -------");
			writer.println("성명\t JAVA\t oracle\t 평균");//\t는 tap(들여쓰기)해라
			writer.printf("%s\t %3d\t %3d\t %4.1f\n","홍길동",80,92,(80+92)/2f);//%3d\t==>3개의 정수를 받는다.그리고 들여써라는 뜻
			writer.printf("%s\t %3d\t %3d\t %4.1f\n","전우치",90,99,(90+99)/2f);//%4.1f\n==>정수가4,소수점1개까지 나타내고 줄바꿈
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
		
		
		

	}

}
