package com.square;

import java.util.Scanner;

public class PerfectSquareCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		Integer num = sc.nextInt();
		int temp=0;
		for (int i = 1; i < num; i++) {
			if (i * i == num) {
				System.out.println("Given number is square of " + i);
				temp=temp+1;
				return;
			}
		}
		if(temp==0) {
			System.out.println("Given no is not perfect square");
		}
	}
}
