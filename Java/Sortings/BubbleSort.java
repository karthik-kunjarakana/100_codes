package Sortings;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {5,2,4,1,3};
		int sorted [] =bubbleSortofArr(arr);
		System.out.println(Arrays.toString(sorted));
	}
	static int[] bubbleSortofArr(int [] arr) {
		for (int i = 0;  i< arr.length;i ++) { 			// for (int i = 0;  i< arr.length;i ++) {
			for (int j = i+1; j < arr.length; j++) {	// for (int j = 0; j < arr.length-i-1; j++)
				if(arr[i]>arr[j]) {						// if(arr[i]>arr[j+1]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	

}
