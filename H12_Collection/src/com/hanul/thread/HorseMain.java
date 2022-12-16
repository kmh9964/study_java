package com.hanul.thread;

public class HorseMain {

	public static void main(String[] args) {
		
		
		Horse h1 = new Horse("거센질주",1);
		Horse h2 = new Horse("다크호스",2);
		Horse h3 = new Horse("흥행전사",3);
		Horse h4 = new Horse("적토마",4);
		Horse h5 = new Horse("날쌘돌이",5);
		
		// 쓰레드를 상속받았기 때문에 실행시키는 매소드는 : start();==>이건 쓰레드거 가져다 쓴다
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		

	}

}
