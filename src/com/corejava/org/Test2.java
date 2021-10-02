package com.corejava.org;
abstract class Bank{
	abstract int getRateOfInterest();
}
class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class PNB extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		System.out.println("rate of interest:"+b.getRateOfInterest());
		b=new PNB();
		System.out.println("rate of interest:"+b.getRateOfInterest());
		
	}

}
