package com.hanul.printwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex79_PrintWriterMain2 {

	public static void main(String[] args) {
		
		File dir = new File("src/printwrite");
		if (!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		PrintWriter writer = null;
		try {
			
			writer = new PrintWriter(dir + "/" + "test.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>파일 IO</h1>");
			writer.println("오늘은 파일 IO 연습 중입니다.");
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
