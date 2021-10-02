package com.corejava.org;

interface Bank1{
	float rateOfInterest();
}
class SBI1 implements Bank1{
	public float rateOfInterest() {
		return 9.15f;
	}
}
class PNB1 implements Bank1{
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class InterfaceTest3Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 b1=new SBI1();
		System.out.println("ROI:"+b1.rateOfInterest());

	}

}
