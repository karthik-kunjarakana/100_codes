package Array;

public class CounyEvenAndOdd {
public static void main(String[] args) {
	int arr[]= {2,4,7,9,6,7,9,3,2};
	int even=0,odd=0;
	for (int i : arr) {
		if(i%2==0) even+=1;
		else odd+=1;
	}
	System.out.println(odd);
	System.out.println(even);
}

}
