package com.corejava.org;

public class Practical2{
	
	public void finalize() {
		System.out.println("finalize called:");
	}
	
	public static void main(String args[]) {
		
		Practical2 p1=new Practical2();
		Practical2 p2=new Practical2();
		p1=null;
		p2=null;
		System.gc();
		
	}
	}
