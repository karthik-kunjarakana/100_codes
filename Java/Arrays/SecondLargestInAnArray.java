package Array;

public class SecondLargestInAnArray {
	static int SecondLargest(int arr[]) {
		if(arr==null || arr.length ==0||arr.length ==1)
			return -1;
		int max=arr[0];
		int secondMax =Integer.MIN_VALUE;
		for (int i=1 ;i<arr.length;i++){
			if(max<arr[i]) {
				secondMax=max;
				max=arr[i];		
			}
		else if (secondMax<arr[i] && arr[i]!=max) {
			secondMax=arr[i];
			
		}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int arr[]= {-1,-8,-2,-1,-4};
		System.out.println(SecondLargest(arr));
	}
}
