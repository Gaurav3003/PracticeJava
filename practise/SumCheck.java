package com.practise;

import java.util.Arrays;

public class SumCheck {

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int n = 16;
		int arr_size = A.length;

		// Function calling
		if (hasArrayTwoCandidates(A, arr_size, n))
			System.out.println("Array has two " + "elements with given sum");
		else
			System.out.println("Array doesn't have " + "two elements with given sum");

	}

	private static boolean hasArrayTwoCandidates(int[] a, int arr_size, int n) {
		int l = 0, r = arr_size - 1;
		Arrays.sort(a);
		while (l < r) {
			int sum = a[l] + a[r];
			if (sum == n)
				return true;
			else if (sum > n)
				r--;
			else {
				l++;
			}
		}
		return false;
	}

}
