package com.practise;

public class FindMin {

	public static void main(String[] args) {
		int arr1[] =  {5, 6, 8, 2, 3, 4}; 
        int n1 = arr1.length; 
        System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1)); 

	}

	private static int findMin(int[] arr, int l, int h) {
		if(h<l) {
			return arr[0];
		}
		if(h==l) {
			return arr[l];
		}
		 int mid = (l+(h-l))/2;
		 
		 if(mid <h && arr[mid+1]<arr[mid]) {
			 return arr[mid+1];
		 }
		 if(mid>l && arr[mid]<arr[mid-1])
			 return arr[mid];
		 
		 if(arr[h]> arr[l])
			 return findMin(arr, l, mid-1);
		 
		return findMin(arr, mid+1, h);
	}

}
