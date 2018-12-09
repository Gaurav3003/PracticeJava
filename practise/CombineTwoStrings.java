package com.practise;

public class CombineTwoStrings {

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "forgeeks";
		System.out.println(combine (s1, s2));

	}

	private static String combine(String s1, String s2) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		StringBuilder sb = new StringBuilder();
		while(i< s1.length() && j<s2.length()) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(j));
			i++;
			j++;
		}
		if(i!=s1.length()) {
			sb.append(s1.substring(1));
		}
		if(j!=s2.length()) {
			sb.append(s2.substring(j));
		}
		
		return sb.toString();
	}

}
