package weekone;

//Program for the Strong number
public class StrongNumber {
public static void main(String[] args) {
	int number = 0;
	int original=number;
	int sum =0;
	while(number!=0) {
		int dig=number%10;
		sum+=factorial(dig);
		number/=10;
	}
	System.out.println(sum);
	System.out.println(sum==original?"Strong Number":"Not a Strong Number");
	}
static int factorial(int num) {
	int fact =num;
	for (int i = 2; i <num; i++) {
		fact*=i;
	}
	return fact;
	}
	
}


