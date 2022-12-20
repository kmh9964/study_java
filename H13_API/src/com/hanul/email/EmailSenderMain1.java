package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class EmailSenderMain1 {

	// 이메일 전송 클래스
	public static void main(String[] args) {
		

		
		//한사람한테 보낼때 : 보내는 사람 지정하고
		EmailSender1 sender = new EmailSender1("raki82@naver.com", "kmhkmh82*#", "관리자");
		//받는 사람 지정하면 된다.
//        sender.sendSimple("raki82@naver.com", "강미화");
		//첨부파일 포함해서 메일 보낼때
		sender.sendAttach("raki82@naver.com", "강미화");
		
		
		
		
		
		
		

	}

}
