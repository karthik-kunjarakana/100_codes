package Array;

import java.util.Arrays;

public class CheckWhatsTheNumber {
public static void main(String[] args) {
	int arr[]= {4,3,7,21};
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2!=0 && !isPrime(arr[i])) {
			arr[i]=arr[i]*arr[i];
		}
//		else if(arr[i]!=2 && isPrime(arr[i]))
		else if(isPrime(arr[i]) && arr[i] != 2) 
			arr[i]=cubes(arr[i]);
			
	else if(arr[i]%2==0)
		arr[i]=poweofarrlen(arr[i], arr);
	}
	System.out.println(Arrays.toString(arr));
}

static boolean isPrime(int n) {
	for (int i = 2; i <=n/2; i++) {
		if(n%i==0)return false;
	}
	return true;
}
static int cubes(int num) {
	int res=1;
	res=num*num*num;
	return res;
}
static int poweofarrlen(int n,int arr[]) {
	int len=arr.length;
	int out=1;
	while(len!=0) {
		out*=n;
		len--;
	}
	return out;
}
}