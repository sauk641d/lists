package com.middle;

public class MiddleEle {

	// main method
	public static void main(String[] args) {

		// Declare and initialize the array elements
		int[] nums = new int[] { 1, 6, 5, 2, 4, 7, 9, 4, 6, 9 };

		// Index position
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		// logic implementation for middle element

		// if even number of array elements are present
		if (nums.length % 2 == 0) {
			System.out.println("The value is odd, then middle element are: ");

			// even-length array (two middle elements)
			int x = nums[(nums.length / 2) - 1];
			System.out.println(x);
			int y = nums[nums.length / 2];
			System.out.println(y);
		}

		// if odd number of array elements are present
		else {

			// odd-length array (only one middle element)
			int z = nums[nums.length / 2];
			System.out.println("The value is even then middle element is: ");
			System.out.println(z);
		}

		// { 1, 6, 5, 2, 4, 7, 9, 4, 6, 9 }
		int temp, j;
		for (int i = 1; i < nums.length; i++) {
			temp = nums[i];//which element check take into nums[i]
			j = i;
			while (j > 0 && nums[j - 1] > temp) {
				nums[j] = nums[j - 1];
				j = j - 1;
			}
			nums[j] = temp;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
