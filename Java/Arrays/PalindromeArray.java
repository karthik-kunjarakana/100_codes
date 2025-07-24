package Array;

public class PalindromeArray {
 static boolean isPalindrome(int arr[]) {
	 int i=0;
	 int j=arr.length-1;
	 while(i<j) {
		 if(arr[i]!=arr[j]) {
			 return false;
		 }
		 i++;
		 j--;
	 }
	 return true;
 }
 public static void main(String[] args) {
	int arr1[]= {1,2,1};
	System.out.println(isPalindrome(arr1));
	int arr2[]= {1,2,3};
	System.out.println(isPalindrome(arr2));
}
}
