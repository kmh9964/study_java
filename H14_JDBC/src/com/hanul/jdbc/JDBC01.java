package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		
		//1. 오라클 드라이버(ojdbc8.jar)를 다운로드 하여 lib 폴더에 넣는다.
		//2. BuilePath에 들어가서 Add External JARs...파일 추가--> 프로젝트명 아래에 Referenced Libraries가 생김
		
		
	    ////전역변수로 만들어줘야 close해줄때 try~catch해준뒤  finally에 close();를 넣어줄수 있다.
		Connection conn = null;//데이터베이스와 연결하는 객체 변수
		Statement stmt = null; //sql문 실행 기능이 있는 Statement 객체 변수
		ResultSet rs =null; //결과물을 받아올 ResultSet 타입의 객체 변수
			
		try {
		//1.드라이버 생성 : class.forName(로드하는 드라이버명); 매소드 사용
		Class.forName("oracle.jdbc.driver.OracleDriver");//대소문자 잘 맞춰 쓰자
		System.out.println("드라이버 생성 완료");
		
		//2.데이터베이스와 연결 : Connection(연결) 객체가 필요
		//  DriverManager.getConnection(연결하는 데이터베이스 URL,DB의 사용자이름,패스워드); 매소드 사용
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//연결하는 데이터베이스 URL이 길어서 변수에 넣어줌
		conn = DriverManager.getConnection(url,"hr","0000");//연결하는 객체를 conn변수에 넣어줌	
		System.out.println("DB 접속 성공");//DB 접속 성공이라고 출력되면 연결 완료.
		
		//3.연결 되면 SQL문 선언
		
	
		//4.데이터베이스에 SQL문 실행
		
		//5.만약 받아오는 결과물이 있으면 받음
		
		//6.DB 연결 해제
		conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
