package com.armstrong;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Integer no=sc.nextInt();
		int t1=no;
		int leng=0;
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		int t2=no, rem, arm=0;
		int mul=1;
		while(t2!=0) {
			rem=t2%10;
			for(int i=1; i<=leng; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println("number is Armstrong "+no);
			
		}else {
			System.out.println("number is not Armstrong");
		}
	}
}
