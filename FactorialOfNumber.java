package com.practices;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a=sc.nextInt();
		int res=1,i;
		for(i=2;i<=a;i++) {
			res=res*i;
		}
		System.out.println(res);
	}

}
