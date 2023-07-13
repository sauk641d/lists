package com.maxnumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 10, 20, 40);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max Value is " + max);

		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min value is "+min);
		
		int[] a = { 10, 30, 60, 80 };
		int max1 = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
			}
		}
		System.out.println("max1 value is "+max1);
	}

}
