package Array;

import java.util.Arrays;

public class rotaterightbyN {
			
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotaterightByK(arr,3);
		System.out.println(Arrays.toString(arr));
	}
	static int[] rotaterightByK(int [] arr,int k){
		while(k!=0) {
		int last = arr[arr.length-1];
		for (int i = arr.length-1; i > 0; i--) {
			arr[i]=arr[i-1];
		}
			arr[0] = last;
		
		k--;
		}
		return arr;
	}
	}


