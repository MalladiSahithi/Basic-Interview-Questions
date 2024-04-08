package com.practices;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
		int a=0,b=1;
		int nextTerm;
		for(int i=2;i<=n;i++) {
			nextTerm=a+b;
			a=b;
			b=nextTerm;
		System.out.print(nextTerm +" ");
		}
	}

}
