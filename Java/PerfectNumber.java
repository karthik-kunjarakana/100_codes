package weekone;

public class PerfectNumber {
public static void main(String[] args) {
	int num=28;
	int orig=num;
	int sum=0;
	for (int i = 1; i <=num/2; i++) {
		if(num%i==0)sum+=i;	
	}
	System.out.println(sum);
	System.out.println(sum==orig?"Perfect":"Not perfect");
}
}
