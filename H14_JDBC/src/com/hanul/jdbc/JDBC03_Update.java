package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC03_Update {

	public static void main(String[] args) {
		
		//sql에서 update명령문 사용할때

		
		//0. 객체변수 선언
		//전역변수로 만들어줘야 close해줄때 try~catch해준뒤  finally에 close();를 넣어줄수 있다.
		Connection conn = null;//데이터베이스와 연결하는 객체 변수
		Statement stmt = null; //sql문 실행 기능이 있는 Statement 객체 변수
		ResultSet rs =null; //결과물을 받아올 ResultSet 타입의 객체 변수
		
		
		//1. 드라이버 생성 : class.forName(로드하는 드라이버명); 매소드 사용
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");//대소문자 잘 맞춰써줄것
		
		//2. 데이터베이스와 연결 : Connection(연결) 객체가 필요
		//  DriverManager.getConnection(연결하는 데이터베이스 URL,DB의 사용자이름,패스워드); 매소드 사용
		
		//데이터베이스를 연결할때 URL방법이 세가지가 있다-->URL이 길어서 변수url에 넣어줌
		//String url = "jdbc:oracle:thin:@localhost:1521:xe";//이미 정의되어 있는 @localhost를 사용
		//String url = "jdbc:oracle:thin:@192.168.0.11:1521:xe";//@192.168.0.11 내 컴퓨터의 IP를 찾아서 써줌
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";//이미 정의되어있는@127.0.0.1
		conn = DriverManager.getConnection(url,"hr","0000");//연결하는 객체를 conn변수에 넣어줌
		
		//3. SQL과 연결 되면 SQL 명령문(update) 선언
		//100번 사원의 급여, 이메일, 전화번호를 변경해본다.
		//SQL 자료가 문자열이면 작은따옴표로 묶어줘야 된다.
		String sql = "update employees set"
				    + " salary=26000, email='king@naver.com', phone_number='010-4567-9852' "
				    + " where employee_id = 100";
		
		//3-1. 객체 생성--> sql문 실행 기능이 있는 Statement 클래스 사용해서 객체를 생성
		stmt = conn.createStatement();//Statement 임포트시킬때 두번째거 두개있는걸로 하자
		
		//insert,update,delete문을 실행할때는 Statement 객체의 
		//executeUpdate();라는 매소드를 사용해야 된다.
		//쿼리문을 실행
		int cnt = stmt.executeUpdate(sql);
		if(cnt>0) {
			System.out.println("업데이트 성공");
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		
		   try {
			   //4. DB 연결 해제
				if(rs !=null) {
				rs.close();
				}
				if(stmt !=null) {
					stmt.close();
					}
				if(conn !=null) {
					conn.close();
					}
			
			
		   } catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		}

		
		

	}

}
