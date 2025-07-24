package Sortings;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {5,2,4,1,3};
	int sorted [] =selectionSort(arr);
	System.out.println(Arrays.toString(sorted));
}
static int [] selectionSort(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		int minIndex=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					int temp = arr[minIndex];
					arr[minIndex]=arr[j];
					arr[j]=temp;
				}
			}			
	}
	return arr;
}
}
