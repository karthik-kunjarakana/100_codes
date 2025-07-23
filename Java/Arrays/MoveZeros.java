package Array;

import java.util.Arrays;

public class MoveZeros {
public static void main(String[] args) {
	int arr[]= {1,0,2,0,5,4};
	System.out.println(Arrays.toString(movezerostoright(arr)));
}
static int[] movezerostoright(int [] arr) {
	int index =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[index++]=arr[i];
		}
	}while(index<arr.length) {
		arr[index++]=0;
	}
return arr;
}
}