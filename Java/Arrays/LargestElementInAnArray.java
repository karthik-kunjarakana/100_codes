package Array;

public class LargestElementInAnArray {
	static int getMax(int arr[]) {
		if(arr==null || arr.length ==0)
			return -1;
		int max=arr[0];
		for (int i=1 ;i<arr.length;i++){
			if(max<arr[i]) max=arr[i];		
			}
		return max;
	}
		
	
	
public static void main(String[] args) {
	int arr[]= {};
	System.out.println(getMax(arr));
}
}
