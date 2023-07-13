package com.sort;

import java.util.Arrays;

public class ArraySort {
	public static void main(String arg[]) {
		int[] arr = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };

		//Approach-1
		Arrays.sort(arr);
		System.out.println("Element of arr Sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		
		System.out.println("sort without using inbuild method");
		//Approach-2
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];//which element check take into nums[i]
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
