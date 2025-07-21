package weekone;

import java.util.Arrays;

public class FibonacciNumber {
//Fibonacci Number
public static void main(String[] args) {
	int num=10;
	if(num==0)System.out.println(0);
	else if(num==1)System.out.println(0);
	else {
	int fib[]=new int[num];
	fib[0]=0;
	fib[1]=1;
	for (int i = 2; i < fib.length; i++) {
		fib[i]=fib[i-1]+fib[i-2];
	}
	
	System.out.println(Arrays.toString(fib));
}
}

}
