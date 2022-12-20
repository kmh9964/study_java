package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.border.EmptyBorder;

public class JDBC02_Select {

	public static void main(String[] args) {
		//sql에서 select 명령문 사용할때
		
				
		//0. 전역 변수 선언 및 초기화
		//전역변수로 만들어줘야 close해줄때 try~catch해준뒤  finally에 close();를 넣어줄수 있다.
		Connection conn = null;//데이터베이스와 연결하는 객체 변수
		Statement stmt = null; //sql문 실행 기능이 있는 Statement 객체 변수
		ResultSet rs =null; //결과물을 받아올 ResultSet 타입의 객체 변수
		
		//9. 설계도 클래스를 만든 후 배열리스트에 받기 위해 객체 생성
		ArrayList<Employees> empArr = new ArrayList<>();
		
		//1. 드라이버 생성 : class.forName(로드하는 드라이버명); 매소드 사용
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//대소문자 잘 맞춰써줄것
		
		//2. 데이터베이스와 연결 : Connection(연결) 객체가 필요
		//  DriverManager.getConnection(연결하는 데이터베이스 URL,DB의 사용자이름,패스워드); 매소드 사용
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//연결하는 데이터베이스 URL이 길어서 변수에 넣어줌
		conn = DriverManager.getConnection(url,"hr","0000");//연결하는 객체를 conn변수에 넣어줌
		
		//3. SQL과 연결 되면 SQL select 명령문 선언
		String sql = "select * from employees";
		
	
		//4. 데이터베이스에 SQL문 실행 
		//-->sql문 실행 기능이 있는 Statement 클래스 사용,
		//select 명령문을 사용할때는 executeQuery(); 매소드 사용
		stmt = conn.createStatement();//Statement 임포트시킬때 두번째거 두개있는걸로 하자
		
		//5.만약 받아오는 결과물이 있으면 받아서 ResultSet 타입의 객체에 담는다.
		//select를 제외한 다른 명령(insert,,,)은 받는 결과물이 없게되므로 받을수 있는게 0(실패)이나 1(성공)이 나온다.
		rs = stmt.executeQuery(sql);//ResultSet 임포트 해주자
		
		//6.결과 데이터행을 출력하기:rs.next()함수(데이터가 있는지 확인하는 함수) 사용해서 반복문 돌려보자
		while(rs.next()) {//rs.next()함수가 데이터가 없으면 반복문을 빠져나오게 된다
			int emp_id = rs.getInt(1);
			String firstname = rs.getString("first_name");
			String lastname = rs.getString("last_name");
			String email = rs.getString("email");
			String phone_number = rs.getString("phone_number");
			Date hire_date = rs.getDate("hire_date");//Date를 sql걸로 임포트하자
			String job_id = rs.getString("job_id");
			int salary = rs.getInt("salary");
			int commission_pct = rs.getInt("commission_pct");
			int manager_id = rs.getInt("manager_id");
			int department_id = rs.getInt("department_id");
			
			//6-1. 위에서 쓴 while문을 이용한 데이터가 잘 들어왔는지 확인용 출력
			//System.out.println(emp_id + "," + firstname + "," + salary + "," + hire_date);
			
			//10.배열리스트 empArr 객체에 add(); 매소드를 이용해서 자료 넣어주기
			//--> 설계도 클래스에서 만든 생성자 순서대로 넣어줘야된다.
			//-->Emp 쓰고 컨트롤 스페이스바 누르면 설계도 클래스에 있는 생성자가 한꺼번에 들어온다.
			empArr.add(new Employees(emp_id, salary, commission_pct, manager_id,
					department_id, firstname, lastname, email, phone_number, job_id, hire_date));
		}
		//10-1.ArrayList 객체 empArr에 몇개의 자료가 있는지 확인
		//배열에서 length를 쓰듯이 여기선 size로 함
		System.out.println(empArr.size());
		System.out.println();
		
		//11.반복문 이용해서 데이터가 잘 들어갔는지 출력해보자-->간략하게 Department_id가 110번인 사원의 정보 가져와보자
		for(int i=0; i<empArr.size(); i++) {
			if(empArr.get(i).getDepartment_id() == 110) {
				System.out.println(empArr.get(i).getDepartment_id() 
							+", "+ empArr.get(i).getEmployee_id()
							+", "+ empArr.get(i).getEmail()
							+", "+ empArr.get(i).getHire_date());
			}
		}
		
		//8.받은 데이터를 넣은 똑같은 설계도 클래스(DTO)를 따로 만들어서 사용하게 된다. 
		//그런후 다시 여기 메인 클래스로 와서 ArrayList로 자료를 받아서 넣음 된다.
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		
		   try {
			   //7. DB 연결 해제
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
