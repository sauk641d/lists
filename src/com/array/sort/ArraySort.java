package com.array.sort;

public class ArraySort {

	public static void main(String arg[]) {
		int a[] = { 5, 3, 6, 7, 9, 1, 3, 2 };

		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = 0; j < a.length-1-i ; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
