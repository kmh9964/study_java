package com.hanul.method;

public class Ex24_Method01 {

	public static void main(String[] args) {
		
		printCharacter();
		System.out.println("Hello Hanul");
		printCharacter();
		
		printCharpara('#');
		System.out.println("Hello Hanul");
		printCharpara('$');
		
		printCharparaCnt('&',15);
		System.out.println("Hello Hanul");
		printCharparaCnt('@',10);
		
		
	}

	//문자를 출력하는 매소드를 만든다
	public static void printCharacter() { //"printCharacter" 라는 매소드 이름은 내가 정하고 싶은 이름으로 하면 된다.
		for(int i=0; i<13; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}
	
	
	public static void printCharpara(char ch) { //"printCharpara" 라는 매소드 이름은 내가 정하고 싶은 이름으로 하면 된다.
		for(int i=0; i<13; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void printCharparaCnt(char ch, int cnt) { //"printCharparaCnt" 라는 매소드 이름은 내가 정하고 싶은 이름으로 하면 된다.
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void printCharparaCnt( int cnt, char ch ) { //메소드명은 같은 이름을 사용해도 된다. 다만 매개변수를 변경해줘야된다.
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
	
	
	
}
