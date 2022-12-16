package com.hanul.thread;

public class Horse2 implements Runnable {//implements(구현) 원래 있는 Runnable것을 가져다 쓴다

	
	//변수 선언
	String name;
	int no;
	static int rank;
	
	//생성자 만들기
	public Horse2(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	// Runnable의 run() 매소드를 오버라이드 시켜 구현한다
	public void run() {
		int m;
		for(m=0; m<=100; m+=20) {
			if(m == 0) {
				System.out.printf("%d번 경주마 [%s] 막 출발!!\n", no, name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			// 경주마가 100미터를 통과 못했을때 출력부분://20미터 통과할때마다 이렇게 출력되게 해라
			if(m < 100) {
				System.out.printf("현재 %d미터 지점통과 %d번 경주마 [%s]\n", 
						m, no, name);
			}
			// 경주마가 100미터를 통과했을때 순위와 경주마 번호, 이름 출력
			if(m >= 100) {
				++rank;
				System.out.printf("%d위 %d번 경주마 [%s]\n", rank, no, name);
			}
			
			
		}
		
	}
	
	
	
	
}
