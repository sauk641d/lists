package com.lists1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String arg[]) {

		String s1 = "programming";

		// Approach 1
		StringBuilder str = new StringBuilder();
		s1.chars().distinct().forEach(c -> str.append((char) c));
		System.out.println(str);

		// Approach 2

		StringBuilder str1 = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int inx = s1.indexOf(ch, i + 1);
			if (inx == -1) {
				str1.append(ch);
			}
		}
		System.out.println(str1);

		// Approach-3

		char[] arr = s1.toCharArray();
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;

				}

			}
			if (!repeated) {
				str2.append(arr[i]);
			}
		}
		System.out.println(str2);

		// Approach-4

		StringBuilder str3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for (Character c : set) {
			str3.append(c);
		}
		System.out.println(str3);
		
		//Print full length 
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}

	}
}
