package com.lists1;

import java.util.HashMap;
import java.util.Map;

public class CharacterNumOcr {

	public static void main(String arg[]) {

		String input = "hello";

		Map<Character, Integer> map = new HashMap<>();

		char[] chr = input.toCharArray();

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
