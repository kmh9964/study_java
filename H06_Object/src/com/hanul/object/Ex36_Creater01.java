package com.hanul.object;

public class Ex36_Creater01 {

	//변수는 매소드는 소문자로 시작
			//클래스:변수(= 필드 또는 멤버변수), 매소드, 생성자로 이뤄져있다
		
			// 돼지 저금통의 특징==> 주인이 누구인가?, 총액이 얼마인가? =>데이터: 타입 변수(필드)로 나타낸다
			// 행위는 돈을 넣는다, 돈을 뺀다 => 매소드 만들어서 사용한다.
			
			//    데이터       : 타입           변수 
			//_______________________________________________
			//==> 주인        : String        owner
			//==> 총액        : int           total
			//_______________________________________________
			//    행위	     : 리턴타입	     매소드 이름
			//_______________________________________________
			//==> 돈을 넣는다   : int       inputMoney(int money)
			//==> 돈을 뺀다	: int      outputMoney(int money)
			
			//저금통에 대해 
			String owner; //같은 패키지 안에선 사용 가능
			int total;
			
			//생성자=>생성자를 만들었지만 파라미터가 안들어간 경우
			Ex36_Creater01(){
				
			}
			//생성자=>생성자를 만들때 파라미터가 들어간 경우
			Ex36_Creater01(String name){
				owner = name;
			}
			//생성자=>생성자를 만들때 파라미터가 들어간 경우
			Ex36_Creater01(int sum){
				total = sum;
			}
			//생성자=>생성자를 만들때 파라미터가 두개가 들어간 경우
			Ex36_Creater01( int sum, String name){
				owner = name;
				total = sum;
			}
			//생성자=>자신의 클래스를 가르키는 예약어를 써서 만들 경우 this.
			Ex36_Creater01(String owner, int total){
				this.owner = owner;
				this.total = total;
			}
			
			
			
			
			
			
			
		
			int inputMoney(int money) {
				total = total + money;
				return total;
			}
			
			int outputMoney(int money) {
				total = total - money;
				return total;
			}
		
	
	
	
	
	
	
	
	
	
}
