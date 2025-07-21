package weekone;

public class TwistedPrime {//Twisted Prime Number
	static boolean isPrime(int n) {
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0)return false;
		}
		return true;
			
		}
	static int revNum(int n) {
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int num=71;
		int revnum=revNum(num);
		System.out.println(isPrime(revnum)==isPrime(num)?"True":"False");
}
}
