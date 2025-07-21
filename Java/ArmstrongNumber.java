package weekone;

public class ArmstrongNumber {
//Armstrong Number
public static void main(String[] args) {
	int number=153;
	int length=islength(number);
	int original=number;
	int digit=0;
	int sum=0;
	System.out.println(length);
	while(number!=0) {
		digit=number%10;
//		sum+=(int)Math.pow(digit, length);
		sum+=ispower(digit,length);
		number/=10;	
	}
	System.out.println(sum);
	System.out.println(sum==original?"Armstrong Number":"Not an Armstrong Number");
			
}
static int islength(int number) {
	int sum=0;
	while(number!=0) {
		number/=10;
		sum+=1;
	}
	return sum;
}
static int ispower(int num, int pw) {
	int res=1;
	for(int i=pw;i>0;i--) {
		res*=num;
	}
	return res;
}
}
