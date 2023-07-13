package com.dup.ele;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupEle {
	public static void main(String arg[]) {
		int[] a = { 3, 5, 6, 3, 4, 6, 7, 4, 3, 7 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int aa : a) {
			if (map.containsKey(aa)) {
				map.put(aa, map.get(aa) + 1);
			} else {
				map.put(aa, 1);
			}
		}
		System.out.println("Duplicate Elements are: ");
		System.out.println(map);
		Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
		for (Map.Entry<Integer, Integer> me : entry) {
			if (me.getValue() > 1) {
				System.out.println(me.getKey() + " " + me.getValue());
			}
		}
	}
}
