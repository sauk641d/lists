package com.print;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValuePrintA {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(20,30,25,25,27,27,30);
		Set<Integer> set=new HashSet<Integer>();
	    arr.stream().filter(n->!set.add(n)).forEach(System.out::println);
	}

}
