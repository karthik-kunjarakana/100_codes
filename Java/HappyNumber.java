package weekone;

public class HappyNumber {
//Happy Number
	public static void main(String[] args) {
		int num=19;
		int sum=sumofDigits(num);
		while(sum>9) {
			num=sum;
			sum=sumofDigits(num);
		}
		System.out.println(sum==1?"Happy Number":"Not a Happy Number");
	}
	static int sumofDigits(int num) {
		int sum=0;
		while(num!=0) {
			int dig=num%10;
			sum+=dig*dig;
			num/=10;
		}
		return sum;
	}
}
