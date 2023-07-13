package com.addarray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfArray {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		List<Integer> transformList = numbers.stream().map(x -> x + sum).collect(Collectors.toList());
		System.out.println(transformList + " ");
	}

}
