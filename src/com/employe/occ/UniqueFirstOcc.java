package com.employe.occ;

public class UniqueFirstOcc {
	public static void main(String[] args) {

		int[] a = { 4, 6, 4, 5, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			boolean unique = true;
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
