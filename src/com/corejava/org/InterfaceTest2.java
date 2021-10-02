package com.corejava.org;

interface Drawable{
	void draw();
}
class Rectangle1 implements Drawable{
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle1 implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Circle1();
		Rectangle1 s=new Rectangle1();
		d.draw();
		s.draw();

	}

}
