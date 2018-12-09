package com.practise;

public class ReverseArrayWithoutSpecialCharacters {

	public static void main(String[] args) {

		String s1 = "a,b$c";
		char[] charArr = s1.toCharArray();
		System.out.println(reverse(charArr));
	}

	private static String reverse(char[] temp) {
		int l = 0, r = temp.length - 1;

		while (l < r) {
			if (!Character.isAlphabetic(temp[l]))
				l++;
			else if (!Character.isAlphabetic(temp[r]))
				r--;
			else {
				char tmp = temp[l];
				temp[l] = temp[r];
				temp[r] = tmp;
				l++;
				r--;
			}
		}
		String revstr = new String(temp);

		return revstr;
	}

}
