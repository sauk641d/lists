package com.lists2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DescendingArrayList {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator i=list.iterator();
		System.out.println("print the list");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Comparator comp=Collections.reverseOrder();
		Collections.sort(list,comp);
		System.out.println("printing list in descending order..");
		Iterator i2=list.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		ListIterator li=list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
