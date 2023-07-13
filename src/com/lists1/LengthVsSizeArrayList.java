package com.lists1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthVsSizeArrayList {

	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>();

		fruitList.add("mango");
		fruitList.add("pineapple");
		fruitList.add("gauva");
		fruitList.add("grape");
		fruitList.add("jackfruit");
		System.out.println("ArrayList to Array");
		String[] fruits = fruitList.toArray(new String[fruitList.size()]);
		for (String s : fruits) {
			System.out.println(s);
		}
		
		System.out.println("converting Array to Arraylist");
		List<String> l2=new ArrayList<>();
		l2=Arrays.asList(fruits);
		System.out.println(l2);
		

	}
}
