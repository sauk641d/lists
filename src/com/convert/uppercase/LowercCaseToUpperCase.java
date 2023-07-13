package com.convert.uppercase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowercCaseToUpperCase {

	public static void main(String[] args) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "India", "Canada");
		String str = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);
	}

}
