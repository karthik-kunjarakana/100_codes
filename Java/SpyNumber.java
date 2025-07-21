package weekone;

public class SpyNumber {
public static void main(String[] args) {
	int num=132;
	int sum=0,product=1;
	while(num!=0) {
		sum+=num%10;
		product*=num%10;
		num/=10;
	}
	System.out.println(sum==product?"Spy Number":"Not a Spy Number");
}
}
