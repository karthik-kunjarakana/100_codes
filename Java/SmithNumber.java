package weekone;

public class SmithNumber { //Smith Number
	public static void main(String[] args) {
		int num = 666;
		int num2=num;
		if(isPrime(num))System.out.println("Not a Prime");
		else {
			int sum=sumofDigits(num);
			int fact_sum=0;
			for (int i = 2; i < num2; i++) {
				if(num%i==0) {
					if(isPrime(i)) {
						while(num%i==0) {
							fact_sum+=sumofDigits(i);
							num/=i;
						}
					}
				}
			}
			System.out.println(sum);
			System.out.println(fact_sum);
			System.out.println(fact_sum==sum?"Smith Number":"Not a Smith Number");
		}
	}
	static int sumofDigits(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	static boolean isPrime(int n) {
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0)return false;
		}
		return true;
			
		}
	}
