package com.corejava.org;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to reverse:");
		a=sc.nextInt();
		while(a>0) {
			b=a%10;
			a=a/10;
			d=(d*10)+b;
			System.out.println("Entered number is Reversed:"+d);
		}
		
		}

}
