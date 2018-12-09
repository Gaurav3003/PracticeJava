package com.practise;

public class SumNoAdjacent {

	public static void main(String[] args) {
		int arr[] = new int[]{5, 5, 10, 100, 10, 5}; 
        System.out.println(FindMaxSum(arr, arr.length));

	}

	private static int FindMaxSum(int[] arr, int length) {
		int incl = arr[0];
		int excl = 0;
		int excl_sum = 0;
		
		for(int i=1;i<arr.length;i++) {
			excl_sum = incl>excl?incl:excl;
			
			incl = excl + arr[i];
			excl = excl_sum;
		}
		return incl>excl?incl:excl;
	}

}
