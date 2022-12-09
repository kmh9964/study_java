package com.hanul.shape;

public class ShapeMain2 {//다형성

	public static void main(String[] args) {

		Shape rectangle = new Ractangle(10,5);//다형성에 의해서 이렇게 만들수 있다.
		// Shape 클래스를 상속받아서 새로 생성된거이기 때문에 Shape 클래스에 있는 메소드만 사용 가능
		rectangle.getArea();
		
	    //rectangle.getAround(); //Shape 클래스에 있는 메소드가 아니여서,이건 클래스 Ractangle에 있는 것임
		//Shape 클래스걸 받았지만 Ractangle 클래스에만 있는 매소드를 사용하려면 아래처럼 하면 된다
		
		Ractangle rectangle2 =null;//rectangle2가 참조변수이기 때문에 null로 초기화
		if (rectangle instanceof Ractangle) {//rectangle이 Ractangle의 객체라면~
			rectangle2 = (Ractangle)rectangle;//(Ractangle)강제 캐스팅해라
		}
		rectangle2.getAround();
		
			
		
		Shape triangle = new Triangle(10,5);//Shape클래스거만 상속받아서 Shape 클래스것만 사용 가능
		triangle.getArea();//Shape 클래스에 있는 매소드라 사용 가능
		
		//triangle.getAround();//Shape클래스에는 없고 Triangle클래스에만 있으니 사용 못함
		//아래처럼 해주면 사용 가능해진다
		
		Triangle triangle2 = null;//참조형이기 때문에 null로 초기화 해줌.
		if(triangle instanceof Triangle) { 
			triangle2  = (Triangle)triangle;
		}
		triangle2.getAround();
		
			
		
		
		
		
	}

}
