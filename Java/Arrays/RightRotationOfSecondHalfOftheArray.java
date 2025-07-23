package Array;

import java.util.Arrays;

public class RightRotationOfSecondHalfOftheArray {
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	rotateK(arr);
	System.out.println(Arrays.toString(arr));
}
static int[] rotateK(int [] arr){
	int end = arr.length/2;
	int last = arr[arr.length-1];
	for (int i =arr.length-1; i > end; i--) {
		arr[i]=arr[i-1];
	}
		arr[end] = last;
	return arr;
}
}


