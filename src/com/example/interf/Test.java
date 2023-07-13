package com.example.interf;

interface Inter{
	default void m1() {
		System.out.println("Default in Interface");
	}
	static void m2() {
		
		System.out.println("static in Interface");
	}
}

public class Test implements Inter {

	public void m1() {
		System.out.println("m1 in Test class");
		Inter.m2();
	}
static void m2() {
		
		System.out.println("static in m2 method in Test class");
	}
	
	public static void main(String[] args) {
			Test t1=new Test();
			t1.m1();
	}
}
