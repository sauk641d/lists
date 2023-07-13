package com.lists1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SysnchronizeInArrayList {
	
	public static void main(String[] arg) {
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("mango");
		fruitList.add("pineapple");
		fruitList.add("gauva");
		fruitList.add("grape");
		fruitList.add("jackfruit");
		fruitList = Collections.synchronizedList(fruitList);
		System.out.println(fruitList);
		
		
		synchronized(fruitList) {
			
			}
		}
	}


