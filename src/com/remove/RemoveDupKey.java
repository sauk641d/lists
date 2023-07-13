package com.remove;

public class RemoveDupKey {

	public static void main(String[] args) {
		 
		String str="CloudTeCh";
		char ch='C';
		removeChar(str,ch);
	}	
	
	public static void removeChar(String str, char c) {
		int n=str.length();
		String finalStr="";
		for(int i=0; i<n; i++) {
			if(str.charAt(i)!=c) {
				finalStr=finalStr+str.charAt(i);
			}
		}
		System.out.println(finalStr);
	}
}
