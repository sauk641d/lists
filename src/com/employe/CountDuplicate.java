package com.employe;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {

	public static void main(String arg[]) {
		String str = "Programming";
		duplicateCnt(str);
	}

	public static void duplicateCnt(String str) {
		Map<Character, Integer> map = new HashMap();
		char[] chr = str.toCharArray();

		for (char ch : chr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				Integer value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
	}

}
