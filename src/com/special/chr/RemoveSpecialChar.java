package com.special.chr;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "Clou&dT*@eCh!+";

		// Approach-1
		// String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "");
		//
		// System.out.println(replaceAll);
		//

		int count = 0;

		String resultCharacter="";
		
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))
					&& (!Character.isWhitespace(str.charAt(i)) && (!Character.isLetter(str.charAt(i))))) {
				count++;
			}else {
				resultCharacter=resultCharacter+str.charAt(i);
			}
		}
		if (count == 0) {
			System.out.println("There is no special character in String");
		} else {
			System.out.println("Special Character found: " + count);
		}
		
		System.out.println(resultCharacter);

	}

}
