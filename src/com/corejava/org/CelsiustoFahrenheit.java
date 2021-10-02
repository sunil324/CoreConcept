package com.corejava.org;

import java.util.Scanner;

public class CelsiustoFahrenheit {
	public static void main(String args[]) {
		float c;
		float f;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temp in centi grade:");
		c=sc.nextFloat();
		f=(float)((1.8*c)+32.0);
		System.out.print("Temp in fahrenheit="+f);
		
		
	}

}
