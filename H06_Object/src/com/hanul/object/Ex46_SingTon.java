package com.hanul.object;

public class Ex46_SingTon {

	
		//싱글톤 : 공유영역에 한개만 인스턴스를 생성
		//데이터를 연결할때 사용하기 위한 클래스
		//singleTon
		private static Ex46_SingTon instance;
		
		private Ex46_SingTon() {}
		
		static Ex46_SingTon getInstance() {
			if(instance == null) {
				instance =  new Ex46_SingTon();
			}
			return instance;
		}
	
	
}
