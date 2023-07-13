package com.lists1;

class A{
	public void calculate(){
		System.out.println("calculate in class A");
	}	
}

class B extends A{
	public void calculate(){
		System.out.println("calculate in class B");	
	}
}

class C{
	public static void main(String arg[]){	
		A a1=new B();
		a1.calculate();
	}
}
