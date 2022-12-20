package com.hanul.printwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		
	
		
		// 변수 선언
		BufferedReader in = null;
		//10명 저장할 배열 변수 선언
		String[] studentInfo = new String[10];
		//BufferedReader 클래스를 사용해서 studentlist.txt의 문자열 읽어오기
		String filename = "studentlist.txt";
		try {
			in = new BufferedReader(new FileReader(filename));
			String data;//readline()으로 읽어온 값을 넣을 변수 선언
			int i=0;
			// readline()이용해서 한줄씩 읽어온 값이 null이 아니라면 data 변수에 넣고 반복해서 실행해라
			while((data = in.readLine()) !=null) {
			    studentInfo[i] = data;//data의 값을 다시 studentInfo[i]배열에 넣어라
			    i++;
				System.out.println(data);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("읽기 끝");
		
		//src/printwrite/list.html 파일로 저장하기		
		File dir = new File("src/printwrite");
		//exists()파일이 존재하는지 체크,isDirectory()디렉토리인지 체크,mkdirs()디렉토리를 만들어라
		if (!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(dir + "/" + "list.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			writer.println("<table border='1'>");
			writer.println("<tr><th>이름</th><th>성별</th><th>연락처</th><th>이메일</th></tr>");
			//향상된 for문 사용
			for(String str : studentInfo)	{
			String[] printData= str.split(",");
			
		     writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>\n"
						, printData[0], printData[1], printData[2], printData[3]);
		    
			}
			 writer.println("</table>");
		     writer.println("</body>");
		     writer.println("</html>");
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				writer.flush();
				writer.close();
				System.out.println("list.html 만들기 끝");
				
			}
			 
			 
	}				
		
		}
		
			
	
	


