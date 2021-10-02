package com.corejava.org;

import java.util.Scanner;

public class SwapingNumber {
	public static void main(String args[]) {
		int x;
		int y;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x and y \n");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.print("Before Swapping \n x="+x+"\n y="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.print("After Swapping x="+x+"\n y="+y);
	}

}
