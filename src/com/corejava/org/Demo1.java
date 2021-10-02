package com.corejava.org;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow ;
		int num;
		int i=1;
		int sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		num=sc.nextInt();
		System.out.println("Enter power:");
		pow=sc.nextInt();
		while(i<=pow) {
			sum=sum+sum;
			i++;
		}
		System.out.println("\n"+num+"to the power"+pow+"is:"+sum);
		
		
}
}
