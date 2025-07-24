package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6,7,8};
		int arr[]=commons(arr1,arr2);
	for (int i : arr) {
		System.out.println(i);
	}
		
	}
	static int [] commons(int arr1[],int arr2[]) {
		int[]arr= new int[arr1.length];
		int index=0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr1[i]==arr2[j])
					arr[index++]=arr1[i];
			}
		}
		return arr;
	}

}
