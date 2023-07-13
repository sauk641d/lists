package com.employe.demo;

public class CntDup {
	
	public static void main(String arg[]) {
		String s1="saurabh";
		int[] arr=new int[256];
		for(int i=0; i<s1.length(); i++) {
			arr[s1.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(arr[i]>1) {
				System.out.println((char)i +" count: " +arr[i]);
			}
		}
	}
}
