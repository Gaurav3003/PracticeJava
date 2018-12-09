package com.practise;

public class LongestSubsequenceIgnoringSpecialChars {

	public static void main(String[] args) {

		String s1 = "ABCAAA@AA%ANM";

		char[] charArr = s1.toCharArray();

		findSubsequence(charArr);
	}

	private static void findSubsequence(char[] s1) {

		int count = 0;
		int tempCount = 0;
		for (int i = 0; i < s1.length - 1; i++) {
			
				if ((Character.isAlphabetic(s1[i]) && Character.isAlphabetic(s1[i + 1]))&&s1[i] == s1[i + 1]) {
					++tempCount;
					count = Math.max(count, tempCount);
				}
			
		}
		System.out.println(count);

	}

}
