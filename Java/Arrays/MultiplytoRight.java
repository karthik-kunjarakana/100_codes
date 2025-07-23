package Array;

public class MultiplytoRight {
public static void main(String[] args) {
	int []arr= {1,2,3,4};
	System.out.println(multiplyright(arr, 2));
}
static int multiplyright(int arr[],int k) {
	int product=k;
	ReverseArray(arr);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==k) break;
		else {
			product*=arr[i];
		}
	}
	return product;
}
static int [] ReverseArray(int arr[]){
	int j=arr.length-1;
	int i=0;
	while(i<j) {
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	return arr;
}
}
