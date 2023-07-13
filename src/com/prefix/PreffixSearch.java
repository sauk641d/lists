package com.prefix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PreffixSearch {
	public static void main(String arg[]) {
		List<Integer> list = Arrays.asList(2, 33, 22, 256, 278, 23, 44, 66);
		List<Integer> numWith2 = list.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(numWith2);
		
		
		int a[]= {2,44,36,289,22,280};
		for(int i=0; i<a.length; i++) {
			
		}
	}

}
