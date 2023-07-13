package com.add.even;

import java.util.ArrayList;
import java.util.List;

public class AddEvenNum {

	public static void main(String[] args) {
		int[] no = { 1, 2, 3, 4, 5, 6 };
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0; i < no.length; i++) {
			if (no[i] % 2 == 0) {
				al1.add(no[i]);
			} else {
				al2.add(no[i]);
			}
		}

		System.out.println("even no is: ");
		int total1 = 0;
		for (int a : al1) {
			total1 = total1 + a;
			System.out.println(a);
		}
		System.out.println("even no are " + al1.size());
		System.out.println("Total sum of al1 is: " + total1);
		
		System.out.println("***************************************");
		
		System.out.println("odd no is: ");
		int total2 = 0;
		for (int b : al2) {
			total2 = total2 + b;
			System.out.println(b);
		}
		System.out.println("odd nos are " + al2.size());
		System.out.println("Total sum of al1 is: " + total2);
	}
}
