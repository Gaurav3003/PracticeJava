package com.practise;

public class EqulibriumPoint {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        int arr_size = arr.length; 
        System.out.println("First equilibrium index is " +  
                          equilibrium(arr, arr_size)); 

	}

	private static int equilibrium(int[] arr, int arr_size) {
		int sum = 0;
		int left_sum=0, right_sum=0;
		for (int i = 0; i < arr_size; ++i) {
			sum += arr[i];

		}

		for (int j = 0; j < arr_size; ++j) {
			
			sum -= arr[j];
			if (left_sum == sum) {
				return j;

			}
			left_sum += arr[j];
		}

		return -1;
	}

}
