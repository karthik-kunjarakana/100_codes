package weekone;

public class NeonNumber {
public static void main(String[] args) {
	int num=9,sum=0;
	int square = num*num;
	while(square!=0) {
		sum+=square%10;
		square/=10;
	}
	System.out.println(sum==num?"Neon":"Not a Neon");
}
}
