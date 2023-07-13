package com.sorted.num;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,6,10,3,5,6);
		List<Integer> sort = list.stream().skip(1).limit(4).collect(Collectors.toList());
		System.out.println(sort);
		
		Integer sort1 = list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println(sort1);
	}
}
