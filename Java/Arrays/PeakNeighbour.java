package Array;

import java.util.ArrayList;
import java.util.List;

public class PeakNeighbour {
	public static void main(String[] args) {
		int arr[]= {100, 20, 15, 2, 23, 90, 67};
		System.out.println(findPeak(arr));
	}
static List<Integer> findPeak(int arr[]) {
	List<Integer> peaks = new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
//		if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
		if((i==0||arr[i]>arr[i-1]) && (i==arr.length-1 || arr[i]>arr[i+1]) ) {
			peaks.add(arr[i] );
		}
	}
	return peaks;
}
}
