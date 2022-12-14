package com.hanul.file;

import java.io.FileWriter;
import java.io.IOException;

public class Ex73_FileWriter {
			//문자를 써서 파일에 저장하는 방법
	public static void main(String[] args) {
		
		FileWriter writer =null;
		try {
			writer = new FileWriter("output.txt");
			char[] data = {'자','바',' ','프','로','그','램','밍',' ','중','급'};
			
			//for문을 이용해서 하는 방법
//			for(int idx=0; idx<data.length; idx++) {
//				writer.write(data[idx]);
//			}
		
			//for문을 안 돌리고 배열이니깐 이렇게 해도 된다. 방법은 두가지이다
			writer.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally{
			try {
				writer.close();
			} catch (IOException e) {
			   e.printStackTrace();
			}
		}
		//실행을 해야 파일이 생성된다. 저장만 해서는 안된다.Ctrl+F11을 눌러주자==> 왼쪽 폴더명에 눌러주고 f5눌러주면 파일이 생긴다.
		
		
		
		
		
		
		

	}

}
