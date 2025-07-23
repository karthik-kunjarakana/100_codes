package Array;

import java.util.Arrays;

public class RotateTheSecondHalfOfTheArrayByOne{
			
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotater(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] rotater(int [] arr){
		int start = arr.length/2;
		
		int first = arr[start];
		for (int i = start; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
			arr[arr.length-1] = first;
		return arr;
	}
	}


