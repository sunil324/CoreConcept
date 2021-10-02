package com.corejava.org;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String a,b;
		StringBuffer sb;
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the string to check if it is a palindrome:");
		a=sc.nextLine();
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		
		if(a.equals(b)) {
			System.out.print("Enter string is a palindrome:");
		}
		else {
			System.out.print("Enterd string is not a palindrome:"+b);
		}

	}

}
