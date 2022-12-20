package com.hanul.email;

import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender1 {

	
	//메일보내기 클래스(설계도)
	
	// 메일 송신(메일 보내는 사람) 관리자 정보
	private String emailAddress,password,sendName; 
	// 생성자 만들기
	public EmailSender1(String eamilAddress, String password, String name) {
		this.emailAddress = eamilAddress;
		this.password = password;
		this.sendName = name;
	}
	
	// 메일 수신(받는 사람) 정보
	 void sendSimple(String email,String arriveName) { //-->한사람한테만 보낼때 사용
		// 기본 메일 객체 생성(임포트 해줄것)
		SimpleEmail mail = new SimpleEmail();
		// 이메일을 보내는 사람의 메일 서버 지정 해준다 : 형태는 smtp.naver.com(네이버) , smtp.gmail.com(지메일)
		mail.setHostName("smtp."+ emailAddress.substring(emailAddress.indexOf("@") + 1));//indexOf("@")에서 @이가 시작점이 되고 끝점은 없음
		mail.setCharset("utf-8");
		// 메일 전송처리 확인을 위한 로그출력을 지정해줌
		mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정해준다 : 보내는 사람 메일의 인증ID와 비번 지정
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);
		
		try {	
			// 메일 보내는 사람 지정(송신자) :  송신인 메일주소를 full로 지정해야 한다.
			mail.setFrom(emailAddress, this.sendName); //예를 들어 mail.setFrom("raki82@naver.com" , "강미화");
			// 메일 받을 사람 지정 :  수신인 지정 -> 여러명에세 보낼땐 addTo로 추가하면 된다
			// 한사람한테만 보낼때는 아래거 사용
			mail.addTo(email,arriveName); //예를 들어 mail.addTo("raki82@naver.com" , "강미화");
			// 메일 제목, 내용 적는다
			mail.setSubject("생일 축하 메세지");
			//한사람한테 메일 보낼때는 내용 이렇게 하자
			mail.setMsg(arriveName + "님! 생일을 축하하합니다. \n 생일 쿠폰이 " + "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요." );
			// 메일 전송버튼 클릭
			mail.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	 
	// 첨부파일이 있는 이메일 전송 메소드 방법
	void sendAttach(String email, String arriveName) {
		// 객체 생성
		MultiPartEmail mail =  new MultiPartEmail();
		mail.setHostName("smtp."+ emailAddress.substring(emailAddress.indexOf("@") + 1));//indexOf("@")에서 @이가 시작점이 되고 끝점은 없음
		mail.setCharset("utf-8");
		// 메일 전송처리 확인을 위한 로그 출력을 지정해줌
		mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정해준다 : 보내는 사람 메일의 인증ID와 비번 지정
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress,this.sendName);
			mail.addTo(email,arriveName);
			//메세지 넣어주기
			mail.setSubject("생일 축하 메세지 - 첨부파일 확인 요망");
			mail.setMsg(arriveName + "님! 생일을 축하하합니다. \n 생일 쿠폰이 " + "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요." );
			//파일 첨부하기 :  첨부파일 객체 생성
			EmailAttachment file =  new EmailAttachment();
			file.setPath("D:\\study_java\\workspace\\H13_API\\email_list.txt");
			mail.attach(file);
			//첨부할 하일마다 첨부파일 객체를 생성한다.
			// url을 통해 파일 첨부하기 : setPath() 대신 setURL() 매소드 사용한다
			file = new EmailAttachment();
			file.setURL(new URL("https://search.pstatic.net/sunny/?src=https%3A%2F%2Fcdn.crowdpic.net%2Fdetail-thumb%2Fthumb_d_93AA328F02B30D2178A9CF698D3DE3D8.png&type=a340"));
			mail.attach(file);
			mail.send();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		void sendHtml(String email, String arriveName) {

			// Html형식의 내용 이메일 전송
			HtmlEmail mail = new HtmlEmail();
			mail.setHostName("smtp."+ emailAddress.substring(emailAddress.indexOf("@")+1) ); 
			mail.setCharset("utf-8");
			mail.setDebug(true);

			mail.setAuthentication(emailAddress, password);
			mail.setSSLOnConnect(true);

			try {
				mail.setFrom(emailAddress, this.sendName);		
				mail.addTo(email, arriveName);
				mail.setSubject("생일 축하 메시지");

				StringBuffer msg = new StringBuffer();
				msg.append("<html>");
				msg.append("<body>");
				msg.append("<h2>생일 축하</h2><hr>");
				msg.append(arriveName + "님! 생일을 축하합니다");
				msg.append("<p>생일 쿠폰이 발급되었으니</p>");
				msg.append("<p>당사 사이트 쿠폰함을 확인하세요</p>");
				msg.append("</body>");
				msg.append("</html>");
				mail.setHtmlMsg( msg.toString() );

				EmailAttachment file = new EmailAttachment();
				file.setURL(new URL("http://hanuledu.co.kr/data/menu/075399.jpg"));
				mail.attach(file);

				file = new EmailAttachment();
				file.setPath( "D:\\Study_Java\\workspace\\15.API\\src\\test.java" );
				mail.attach(file);

				mail.send();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		
		
		
		
		
		
	}
	
	
	
}
