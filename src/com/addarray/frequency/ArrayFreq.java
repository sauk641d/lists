package com.addarray.frequency;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayFreq {

	public static void cntFrequency(int arr[]) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 40, 50, 30, 40, 40 };
		cntFrequency(arr);	
		System.out.println();
		
		//sorting approach-1
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		//sorting approach-2
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
