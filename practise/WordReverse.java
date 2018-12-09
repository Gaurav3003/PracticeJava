package com.practise;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Thia is good";
		System.out.println(reverse(str).toString());

	}

	private static StringBuilder reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("sb --> "+sb);
		sb.reverse();
		System.out.println("rev sb --> " + sb);
		return sb.reverse();
	}

}
