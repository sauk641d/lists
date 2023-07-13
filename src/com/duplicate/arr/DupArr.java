package com.duplicate.arr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupArr {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 3, 6, 4, 8, 4 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int no : a) {

			Integer count = map.get(no);
			if (count == null) {
				map.put(no, 1);

			} else {
				count = count + 1;
				map.put(no, count);
			}
		}

		Set<Map.Entry<Integer, Integer>> e = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : e) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());

			}
		}
	}
}
