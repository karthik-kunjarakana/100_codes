package Array;

import java.util.Arrays;

public class MoveAllZerostoEnd {
public static void main(String[] args) {
	int [] arr = {1,0,2,0,4,5,7,0,0,4};
	moveZerostoEnd(arr);
	System.out.println(Arrays.toString(arr));
}
static void moveZerostoEnd(int arr[]){
	int index=0;

	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0) {
			arr[index++]=arr[i];
		}
	}
	while(index<arr.length) {
		arr[index++]=0;
	}
	
}
}
