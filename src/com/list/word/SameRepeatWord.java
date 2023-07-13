package com.list.word;

import java.util.Arrays;
import java.util.List;

public class SameRepeatWord {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","orange","apple","mango","apple");
		long count = list.stream().filter(l->l.equals("apple")).count();
		System.out.println(count+" ");
	}
}
