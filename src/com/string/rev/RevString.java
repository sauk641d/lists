package com.string.rev;

public class RevString {
	public static void main(String arg[]) {
		String s1 = "programming";
		String rev = "";

		// Approach-1
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);

		// Approach-2
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
		
		
	}
	
	

}
