package com.hanul.printwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex80_PrintWriterMain3 {

	public static void main(String[] args) {
		
		
		//PrintWriter 는 이클립스에서 파일을 만들수 있다는 거다..
		File dir = new File("src/printwrite");
		if (!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		String[][] studentInfo = {
				//studentInfo[0][0] = 이름,studentInfo[0][1]=성별,
				//studentInfo[0][2]=연락처,studentInfo[0][3]=이메일
				{"홍길동","남","010-1111-2222","hanul@naver.com"},
				{"심청","여","010-2222-3333","hanul22@naver.com"}
		};
		PrintWriter writer = null;
		try {
			
			writer = new PrintWriter(dir + "/" + "student.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			
			writer.println("<table border ='1'>");
			writer.println("<tr>");//<tr>은 표에서 html에서 행
			writer.println("<th>성명</th><td>홍길동</td>");//<th>은 표에서 html에서 열,<td>컬럼명
			writer.println("</tr>");
			writer.println("<th>성별</th><td>남</td>");//<th>은 표에서 html에서 열,<td>컬럼명
			writer.println("<th>연락처</th><td>010-2222-1111</td>");//<th>은 표에서 html에서 열,<td>컬럼명
			writer.println("<th>이메일</th><td>hanul@naver.com</td>");//<th>은 표에서 html에서 열,<td>컬럼명
			
			writer.println("<table border ='1'>");
			writer.println("<tr><th>성명</th><th>성별</th><th>연락처</th><th>이메일</th></th>");
			writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></td>",studentInfo[0][0],studentInfo[0][1],
					studentInfo[0][2],studentInfo[0][3]);
			writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></td>",studentInfo[1][0],studentInfo[1][1],
					studentInfo[1][2],studentInfo[1][3]);//<tr>은 표에서 html에서 행
			
			writer.println("</table>");
			writer.println("</body>");
	        writer.println("</html>");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
		
		

	}

}
