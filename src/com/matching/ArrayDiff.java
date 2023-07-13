package com.matching;

import java.util.Arrays;

public class ArrayDiff {
	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 4, 3 };
		int[] arr2 = { 4, 2, 3, 5 };

		if (equalArray(arr1, arr2)) {
			System.out.println("Two arrays are equals");
		} else {
			System.out.println("Two arrays are not equals");
		}

	}

	public static boolean equalArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		// int m = arr2.length;

		// if (n != m) {
		// return false;
		// }
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
