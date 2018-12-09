package com.practise;

public class RotateArray {
	void leftRotate(int[] arr , int d, int n) {
		
		for (int i=0;i < d ;i++) {
			leftRotateByOne(arr, n);
		}
	}

	private void leftRotateByOne(int[] arr, int n) {
		int i,temp;
		temp = arr[0];
		for(i =0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		
	}

	public static void main(String[] args) {

	}

}
