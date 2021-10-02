package com.corejava.org;

abstract class Bike1{
	Bike1(){
		System.out.println("Bike is created");
	}
		abstract void run();
		void changeGear() {
			System.out.println("change gear:");
		}
	}
class Honda1 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b=new Honda1();
		b.run();
		b.changeGear();

	}

}
