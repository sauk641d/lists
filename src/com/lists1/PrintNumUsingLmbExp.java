package com.lists1;

import java.util.Arrays;
import java.util.List;

public class PrintNumUsingLmbExp {
	public static void main(String arg[]) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,3,6);
		list.forEach(e->{System.out.print(e+" ");});
	}

}
