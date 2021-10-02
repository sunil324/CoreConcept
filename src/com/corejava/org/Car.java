package com.corejava.org;

abstract class Car {
abstract void run();
}
class b extends Car{
	void run() {
		System.out.println("running fastly");
	}
	public static void main(String args[]) {
		Car c=new b();
		c.run();
	}
	
}
