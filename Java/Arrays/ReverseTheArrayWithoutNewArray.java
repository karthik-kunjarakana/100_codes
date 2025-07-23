package Array;

import java.util.Arrays;

public class ReverseTheArrayWithoutNewArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	ReverseArray(arr);
	System.out.println(Arrays.toString(arr));
	
}
static int [] ReverseArray(int arr[]){
	int j=arr.length-1;
	int i=0;
//	for (int i = 0; i < arr.length; i++) {
//		if(i<j) {
//			int temp=0;
//			temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//			j--;
//		}
//	}
	while(i<j) {
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	return arr;
}
}
