package Array;

import java.util.Arrays;

public class RotateByN {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	rotateleftByK(arr, 2);
	System.out.println(Arrays.toString(arr));
}
static int[] rotateleftByK(int [] arr,int k){
	while(k!=0) {
	int first = arr[0];
	for (int i = 0; i < arr.length-1; i++) {
		arr[i]=arr[i+1];
	}
		arr[arr.length-1] = first;
	
	k--;
	}
	return arr;
}
}
