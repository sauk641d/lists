package com.employe;

public class StringDemo {
	
	public static void main(String[] args) {
	
		String str1="Abc";
		String str2="Abc";
		String str3=new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equalsIgnoreCase(str3));
	}
	
}
