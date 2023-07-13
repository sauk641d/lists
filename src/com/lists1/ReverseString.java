package com.lists1;

public class ReverseString {

	public static void main(String arg[]) {
		String input = "java code";
		System.out.println("Orignal input= " +input);

		String[] words = input.split(" ");

		String revOutput = "";
		for (String word : words) {

			String revInput = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revInput = revInput + word.charAt(i);
			}
			revOutput = revOutput + revInput + " ";
		}
		System.out.println("reversed Output= "+revOutput);

	}

}
