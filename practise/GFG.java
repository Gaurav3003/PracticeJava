package com.practise;

//Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number. 
//Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. 
//After the modification, rearrange the array such that all 0’s are shifted to the end.
public class GFG {

	static void modifyAndRearrangeArr(int arr[], int n) {
		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if ((arr[i] != 0) && (arr[i] == arr[i + 1])) {
				arr[i] = 2 * arr[i];
				arr[i + 1] = 0;
				i++;
			}
		}
		
		printArray(arr, n);
		pushZerosToEnd(arr, n);
	}

	private static void pushZerosToEnd(int[] arr, int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] != 0)
				arr[count++] = arr[i];
		}
		
		while(count< n)
			arr[count++] = 0;
		
	}
	
	// function to print the array elements 
    static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }

	public static void main(String[] args) {
		
		System.out.println("iNT.MIN ----> "+ Integer.MIN_VALUE);
		
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 }; 
        int n = arr.length; 
  
        System.out.print("Original array: "); 
        printArray(arr, n); 
  
        modifyAndRearrangeArr(arr, n); 
  
        System.out.print("Modified array: "); 
        printArray(arr, n); 
	}

}
