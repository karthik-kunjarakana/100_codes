package weekone;

public class SumofDigitsinOnes {
	public static void main(String[] args) {
		int num=468;
		int sum=digitoneSum(num);
		while(sum>9) {
			num=sum;
			sum=digitoneSum(num);
		}
		System.out.println(sum);
	}
	static int digitoneSum(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}

}
