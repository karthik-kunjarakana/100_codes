package weekone;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=468;
		System.out.println(digitSum(num));
		
	}
	static int digitSum(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}

}
