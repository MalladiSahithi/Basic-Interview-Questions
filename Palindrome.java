package com.practices;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a=sc.nextInt();
		int temp=a,reverse=0,rem;
		while(temp!=0) {
			rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}
		if(reverse==a) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
