package Array;

import java.util.Arrays;

public class PrimeNumbersInTheSecondHalfOfAnArray {
public static void main(String[] args) {
	int arr[]= {2,4,6,7,11,10};
	int secondHalf[]=new int[arr.length/2];
	int count=0;
	for (int i = arr.length/2; i < arr.length; i++) {
		secondHalf[count++]=arr[i];
	}
	
	int primearray[]= new int[arr.length/2];
	for (int i = 0; i < secondHalf.length; i++) {
		if(isPrime(arr[i]))
			primearray[i]=arr[i];
		
	}
	System.out.println(	Arrays.toString(primearray));
}
static boolean isPrime(int n) {
	for (int i = 2; i <n/2; i++) {
		if(n%i==0)return false;
	}
	return true;
}
}
