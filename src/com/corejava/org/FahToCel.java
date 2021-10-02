package com.corejava.org;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c;
		float f;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temp in Fah:");
		f=sc.nextFloat();
		c=(float)((f-32)/1.8);
		System.out.print("Temp in centigrade:"+c);
		
		
		

	}

}
