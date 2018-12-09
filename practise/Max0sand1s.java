package com.practise;

public class Max0sand1s {

	public static void main(String[] args) {
		int[] arr = {0,0,0,1,1,1,1,0,0,1};
		
		countMaxConsecutive(arr);
		

	}

	private static void countMaxConsecutive(int[] arr) {
		int count0 =0;
		int count1 = 0;
		int temp0 = 1;
		int temp1 = 1;
		for (int j=0;j<arr.length-1;j++) {
			
			if(arr[j]==0 && arr[j]==arr[j+1]) {
				temp0++;
				count0 = Math.max(count0, temp0);
				
			}else if(arr[j]==1 && arr[j]==arr[j+1]) {
				temp1++;
				count1 = Math.max(count1, temp1);
			}else {
				temp0 = 1;
				temp1 = 1;
			}
		}
		
		System.out.println(count0+" -- "+ count1);
		
	}

}
