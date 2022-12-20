package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class EmailSenderMain2 {

	// 여러명한테 이메일 전송 클래스
	public static void main(String[] args) {
		
		//리스트를  불러와서 배열에 넣는다.
		ArrayList<Student> studArraylist = new ArrayList<>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("email_list.txt"));
			String data;
			    //readLine()를 이용해서 한줄씩 읽어온다
			while((data = in.readLine()) !=null) {
				System.out.println(data);
				// 한줄씩 가져온 데이터를 ,(쉼표)를 기준으로 자른다.
				String[] studentarr = data.split(",");
				//배열 순서에 따라 잘라진 데이터를 인덱스로 접근하여 데이터 내용을 가져와서 student를 생성해서
				//ArrayList(student)에 add를 이용해서 넣는다
				studArraylist.add(new Student(studentarr[0],studentarr[1],studentarr[2],studentarr[3]));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("읽기 끝");
		
		
		
		
		//한사람한테 보낼때 : 보내는 사람 지정하고
		EmailSender2 sender = new EmailSender2("raki82@naver.com", "kmhkmh82*#", "관리자");
		//받는 사람 지정하면 된다.
        //sender.sendSimple("raki82@naver.com", "강미화");
		//여러명한테 보낼때 위에서 배열로 짠걸 넣어야된다.
		sender.sendSimple(studArraylist);
		

		
		
		
		
		
		
		

	}

}
