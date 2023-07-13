package com.addarray;

public class AddArray {
	
	public static void main(String arg[]) {
		int[] arr= {10,20,30,40};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
