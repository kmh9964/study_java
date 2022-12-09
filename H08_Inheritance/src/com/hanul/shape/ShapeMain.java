package com.hanul.shape;

public class ShapeMain {

	public static void main(String[] args) {

		
		Triangle triangle = new Triangle(10,5);
		triangle.getArea();
		 
		double area = triangle.getArea1();
			System.out.println("직각삼각형 넓이는 : " + area);
		 
		Ractangle rectangle = new Ractangle(10,5);
		rectangle.getArea();
		
	    double area1 = rectangle.getArea1();
			System.out.println("직각사각형 넓이는 : " + area1);
		 
		
	}

}
