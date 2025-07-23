package Array;


public class MultiplyAllFromRight {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,3,6,7};
		System.out.println(product(arr, 3));
	}
	static int product(int [] arr,int target) {
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		if(index==-1)return index;
		int last=arr.length-1;
		for (int i = index; i < last; i++) {
			int temp=arr[i];
			arr[i]=arr[last];
			arr[last]=temp;
			last--;
		}
		int product=1;
		for (int i = index; i < arr.length; i++) {
			product*=arr[i];
		}
		return product;
	}
	
}
