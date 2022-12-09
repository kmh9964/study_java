package com.hanul.Inheritance;

public class Ex54_PeopleMain {
	//부모클래스에서 상속받을것을 객체에서도 사용할수 있다
	public static void main(String[] args) {

//		Ex53_People people = new Ex53_People("사람", 25);
//		people.eat();
//		people.sleep();//부모클래스가 추상 클래스가 되서 부모클래스의 객체를 생성할 수 없다
//		
		Ex51_Student hong = new Ex51_Student("홍길동", 32 ,"20220001");
		hong.eat();
		hong.sleep();
		hong.go();
		System.out.printf("%s의 나이는 %d이고,학번은 %s 입니다.\n" ,hong.name,hong.age,hong.studentNo);
		System.out.println();
		
		
		Ex52_Worker jeun = new Ex52_Worker("전우치", 40 ,"20201212");
		jeun.eat();
		jeun.sleep();
		jeun.go();
		
		
		
	}

}
