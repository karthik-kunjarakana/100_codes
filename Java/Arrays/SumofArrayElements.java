package Array;
// Sum of elements in an Array
public class SumofArrayElements {
public static void main(String[] args) {
	int arr[]= {1,2,6};
	int sum=0;
	for (int i : arr) {
		sum+=i;
	}
	System.out.println(sum);
}
}
 //Types of Array initialization;
//int[]arr={1,2,3};
//int [] arr = new int[<size>];
//int []arr =null;
//int[]arr=new int []{123};