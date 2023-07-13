package com.arrange.alp;

import java.util.Arrays;

public class ArrangeAlpOrder {

	public static void main(String[] arg) {
		// int[] no= {3,5,5,3,6,8,9,7,6,7};

		String str = "xelophone";
		char[] ch = str.toCharArray();
		char temp;

		// int temp;

		// approach=1
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}
		System.out.println(new String(ch));
		// System.out.println(new Integer(ch));

		// approach=2
		String s = "java";
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
		System.out.println(chr);
	}
}
