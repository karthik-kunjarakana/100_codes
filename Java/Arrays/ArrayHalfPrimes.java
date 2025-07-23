package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayHalfPrimes {
	static List<Integer>primeInSecondhalf(int [] arr){
		List<Integer>prime = new ArrayList<>();
			if(arr == null)return prime;
			for (int i = arr.length/2; i < arr.length; i++) {
				if(isPrime(arr[i])) {
					prime.add(arr[i]);
				}
				
			}
			return prime;
	}

	
	static boolean isPrime(int n) {
		for (int i = 2; i <n/2; i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,7,11,10};
		System.out.println(primeInSecondhalf(arr));
	}
}
