package weekone;

public class DecimaltoOctal {
public static void main(String[] args) {
	int n=110;
	String octal="";
	while(n>0) {
		octal=(n%8)+octal;
		n/=8;
	}
	System.out.println(octal);
}
}
