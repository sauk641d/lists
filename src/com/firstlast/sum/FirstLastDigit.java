package com.firstlast.sum;

import java.util.Scanner;

public class FirstLastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		int lastDigit=no%10;
		int firstDigit = no;
		while(firstDigit>=10) {
			firstDigit=firstDigit/10;	
		}
		System.out.println("firstDigit "+firstDigit);
		System.out.println("lastDigit "+lastDigit);
		System.out.println("sum= "+(firstDigit+lastDigit));
	}
}
