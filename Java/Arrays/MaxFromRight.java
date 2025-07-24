package Array;

public class MaxFromRight {
	    public static void main(String[] args) {
	        int[] arr = {10, 2, 7, 4, 5};
	        int count = 0;
	        int n = arr.length;
	        int max = arr[n - 1];

	        for (int i = n - 2; i >= 0; i--) {
	            if (arr[i] > max) {
	                count++;
	                max = arr[i];
	            }
	        }

	        System.out.println("Count = " + count);  // Output: 2
	    }
	}
