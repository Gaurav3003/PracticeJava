package com.practise;
public class FindingNthLargestElement {

	public static void main(String[] args) {
		int[] arr = {4,2,19,34,8,93,20,7,6,3,5};
		int n = 3;
		if(n>arr.length){
			System.out.println("Please provide the array greater than nth number");
			return;
		}
		System.out.println("largest "+n+" elements are : ");
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j])
					arr[i] = arr[i]+arr[j]-(arr[j]=arr[i]);
			}
			System.out.print(arr[i]+" ");
		}
	}

}
