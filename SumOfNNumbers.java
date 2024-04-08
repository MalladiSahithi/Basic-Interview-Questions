package com.practices;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a=sc.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum=sum+i;
		}
			System.out.println("The sum of numbers is: "+sum);
	}

}
