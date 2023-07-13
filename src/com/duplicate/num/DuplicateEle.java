package com.duplicate.num;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateEle {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 4, 4, 6, 7, 9, 6);
		Set<Integer> dupNum = new HashSet<>();
		List<Integer> collect = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toList());
		System.out.println("dupplicate element are " + collect);
	}
}
