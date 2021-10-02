package com.corejava.org;

interface printable{
	void print();
}
class A6 implements printable{
	public void print() {
		System.out.println("Hello");
	}
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printable obj=new A6();
		obj.print();

	}

}
