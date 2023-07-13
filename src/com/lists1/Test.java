package com.lists1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Integer>{
//	@Override
//	public int compare(Integer o1, Integer o2) {
//(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0;
//		if(o1<o2) {
//			return -1;
//		}
//		if(o1>o2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
//	}	
//}

public class Test {
	public static void main(String arg[]) {

//		List<Integer> list = new ArrayList<>();
//		list.add(30);
//		list.add(50);
//		list.add(10);
//		list.add(29);
		List<Integer> list=Arrays.asList(10,30,50,20,10,60);
		System.out.println(list);
		Comparator<Integer> c = (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
		Collections.sort(list, c);
		System.out.println(list);
	}

}
