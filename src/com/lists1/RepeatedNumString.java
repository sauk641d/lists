package com.lists1;

public class RepeatedNumString {
	public static void main(String arg[]) {
		String s1="programming";
		int[] count=new int[256];
		for(int i=0; i<s1.length(); i++) {
		    count[s1.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(count[i]>1) {
				System.out.println((char)i+ " count= " +count[i]);
			}
		}
		
	}

}
