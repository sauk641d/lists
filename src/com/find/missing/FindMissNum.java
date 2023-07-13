package com.find.missing;

public class FindMissNum {
	
	public static void main(String arg[]) {
		int[] arr= {1,2,3,4,6,7,8,9,10};
		int naturalNum=(10*11)/2;
		int actualNatNum=0;
		for(int i=0; i<arr.length; i++) {
			actualNatNum=actualNatNum+arr[i];
		}
		
		System.out.println("Missing number is "+(naturalNum-actualNatNum));
	}

}
