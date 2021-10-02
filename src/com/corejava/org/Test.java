package com.corejava.org;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("running fast:");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.print("running slow:");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape p=new Circle();
		p.draw();

	}

}
