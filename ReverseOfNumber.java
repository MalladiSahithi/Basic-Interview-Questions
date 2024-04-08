package com.practices;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=sc.nextInt();
		int reverse=0,rem;
		while(a!=0) {
			rem=a%10;
			reverse=reverse*10+rem;
			a=a/10;
		}
		System.out.println("Reverse of number is: "+reverse);
	}

}
