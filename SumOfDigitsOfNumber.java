package com.practices;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int rem,sum=0;
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
			System.out.println("Sum of the digits in numbers is: "+sum);
	}

}
