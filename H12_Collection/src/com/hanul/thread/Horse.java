package com.hanul.thread;

public class Horse extends Thread {//Thread라는 부모클래스거를 상속 받아서 쓴다

	// 경주마 5마리가 100미터 달리기를 하는 멀티쓰레드 프로그램을 작성한다. - thread 패키지

	// 1. Thread 클래스를 상속받아 Horse 클래스를 선언하고 Horse 객체를 
	//    멀티쓰레드로 실행시킨다.
	// 2. 경주마가 달리면서 20미터 간격으로 현재 달리고 있는 지점과 이름을 출력한다.
	//    실제 달리면 20미터 통과지점마다 시간 차이가 있지만 프로그램 상에서는 
	// 	  거의 시간차 없이 출력되므로 시간을 1초정도 간격으로 sleep(1000) 하도록 한다.
	// 3. 도착지점(100미터지점)에서 어떤 말이 몇 등으로 도착했는지의 순위를 출력 한다.
	// 4. static int rank; 	순위필드 
	
	//변수 선언
	String name;
	int no;
	static int rank;
	
	//생성자 만들기
	public Horse(String name, int no) {
		this.name = name;
		this.no = no;
	}
	
	// Thread의 run() 매소드를 오버라이드 시켜 구현한다
	public void run() {
		for(int m=0; m<=100; m+=20) {
			if(m == 0) {
				System.out.printf("%d번 경주마 [%s] 막 출발!!\n", no, name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
