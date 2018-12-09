package com.practise;

public class LeadersInArray {

	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		lead.printLeaders(arr, n);

	}

	private void printLeaders(int[] arr, int n) {
		int leader = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if ((arr[i] > leader)) {
				System.out.print(arr[i] + " ");
				leader = arr[i];
			}
		}

	}

}
