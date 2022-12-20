package com.hanul.email;

import java.util.ArrayList;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender2 {

	// 이메일 전송 클래스
	// 1.프로젝트에 lib폴더를 만든다 --> 패키지에 가서 오른쪽 마우스-->폴더 선택-->lib만들어줌
	// 2.javax.mail.jar, common-email-1.5.jar, activation-1.1.jar
	// 3.위의 3개의파일을 다운로드 받아서 lib 폴더에 넣는다.
	// 3-1.BuilePath에 들어가서 Add External JARs...에 3가지 파일 추가
	// 송신할 메일의 환경설정에서 SMPT 사용을 설정해야 한다.
	//  naver는 죄측하단 환경설정 -> pop3/IMAP설정 -> POP3/SMTP사용함 선택
	
	//  gmail은 상단 환경설정 -> 전달 및 pop3/IMAP -> IMAP 액세스:IMAP 사용으로 선택
	// 		  상단 내 계정 -> 로그인 및 보안 ->맨아래 연결된 앱 및 사이드 ->보안수준이 낮은  앱 허용 : 사용
	// Common Email API(내장 되어있다)는 메일 발송을 처리해주는 SimpleEmail, HtmlEmail과 같은 클래스를 제공하고 있으며,
	// 이들 클래스를 사용하여 일반 텍스트 메일, HTML 메일, 첨부메일 등을 매우 간단하게 보낼수있다.
	
	
	
	// 메일 송신(메일 보내는 사람) 관리자 정보
	private String emailAddress,password,sendName; 
	// 생성자 만들기
	public EmailSender2(String eamilAddress, String password, String name) {
		this.emailAddress = eamilAddress;
		this.password = password;
		this.sendName = name;
	}
	
	// 메일 수신(받는 사람) 정보
	// void sendSimple(String email,String arriveName) { //-->한사람한테만 보낼때 사용
	void sendSimple(ArrayList<Student> studArray) { //-->여러사람한테 배열로 보낼때 사용
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
			//여러사람한테 보낼때는 배열리스트 받아서 반복문 돌릴것
			for(int i = 0; i<studArray.size(); i++) {
				mail.addTo(studArray.get(i).getEmail(),studArray.get(i).getName());
			}
			//한사람한테만 보낼때는 아래거 사용
//			mail.addTo(email,arriveName); //예를 들어 mail.addTo("raki82@naver.com" , "강미화");
			// 메일 제목, 내용 적는다
			mail.setSubject("생일 축하 메세지");
			//여러사람한테 보낼때
			mail.setMsg("생일을 축하합니다. \n 생일 쿠폰이 " + "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요." );
			//한사람한테 메일 보낼때는 내용 이렇게 하자
//			mail.setMsg(arriveName + "님! 생일을 축하하합니다. \n 생일 쿠폰이 " + "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요." );
			// 메일 전송버튼 클릭
			mail.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}
