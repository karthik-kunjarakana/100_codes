package Array;

public class MissingNumber {
public static void main(String[] args) {
	int arr[]= {1,2,8,4,9,7,5,3};
	System.out.println(missingNumber(arr));
}
static int missingNumber(int arr[]) {
	int n=arr.length+1;
	int total=n*(n+1)/2;
	int arraysum=0;
	for (int i : arr) {
		arraysum+=i;
		
	}
	return total-arraysum;
}
}
