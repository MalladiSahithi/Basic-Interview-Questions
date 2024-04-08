package com.practices;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("It is positive");
		}
		else if(a<0) {
			System.out.println("Its is negative");
		}
		else {
			System.out.println("It is zero");
		}
	}

}
