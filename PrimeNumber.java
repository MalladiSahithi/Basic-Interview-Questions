package com.practices;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0;
		if(a!=0) {
			for(int i=0;i<=a;i++) {
				count++;
			}
			if(count>=2) {
				System.out.println("It is not prime");
			}else {
				System.out.println("It is prime");
			}
		}
		
	}

}
