package com.remove.space;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
        //Approach-1
		String str = "  ja va tr a n in g  ";
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println(replaceAll);
		
		
		//Approach-2
		char[] charArray = str.toCharArray();
		String s1="";
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]!=' ') {
				s1=s1+charArray[i];
			}
		}
		System.out.println(s1);
	}

}
