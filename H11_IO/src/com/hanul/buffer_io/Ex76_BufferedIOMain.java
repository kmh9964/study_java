package com.hanul.buffer_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex76_BufferedIOMain {

	public static void main(String[] args) {
		
		//상대 경로에 디렉토리를 만들고자 할때 ==> 파일 경로를 정해준 뒤 파일을 만들어보자
		String filepath1 = "src/buffer_io";	//파일 경로를 지정
		File dir = new File(filepath1);//filepath1이라는 파일을 만들건데 그걸 File dir변수에 넣을거다
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		
		//절대 경로에 디렉토리를 만들고자 할때 ==> 경로를 복사해와서
		String filepath2 = "D:\\study_java\\workspace\\H11_IO\\src\\buffer_io2";//파일 경로를 직접 D드라이브 가서 복사해옴
		File dir2 = new File(filepath2);
		if(!dir2.exists() || !dir2.isDirectory()) {//dir2가 존재하지 않고,dir2의 디렉토리가 없다면,dir2를 만들어라라는 뜻
			dir2.mkdirs();//mkdirs()는 여러개의 디렉토리를 만들때 사용.mkdir()는 한개의 디렉토리를 만들때 사용
		}
		
		//날짜형태로 하위 디렉토리를 만들어야 하는 경우==> 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");//"yyyy/MM/dd"여기에서 월을 꼭 대문자 MM으로 하자
		String today = sdf.format(new Date());//new Date()은 날짜를 말함, 임포트해주자(java.utl이걸로 선택)
		File filepath3 = new File("D:/study_java/workspace/H11_IO/src/" + today);
		if(!filepath3.exists() || !filepath3.isDirectory()) {
			filepath3.mkdirs();
		}
		
		String filename = filepath1 + "/buffered.dat";//파일이름을 src/buffer_io/buffered.dat로 할거다 란 뜻임
		
		//쓰기
		BufferedOutputStream out = null;//BufferedOutputStream에서 출력하는 변수의 초기값 선언
		try {
			out = new BufferedOutputStream(new FileOutputStream(filename));
			byte data[]= {10,20,30,40,50,60,80,90,100,110,120};
			out.write(data);
			out.flush();//버퍼가 다 채워지지 않더라도 잔류하는 모든 데이터를 출력해라.
		} catch (Exception e) { //Exception총체적으로 예외처리 해라. 이걸로 선택
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("쓰기 끝");
		
		//읽기(입력 :inputStream 사용)
		BufferedInputStream in =null;
		try {
			in = new BufferedInputStream(new FileInputStream(filename));
			byte data;
			while((data = (byte)in.read()) !=-1) {
				System.out.println(data + " ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
