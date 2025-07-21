package weekone;

public class SecondLargestOfFour {
	public static void main(String[] args) {
	
	int a=8,b=100,c=25,d=23;
if(a>b&&a>c&&a>d) {
	if(b>c&&b>d)
	System.out.println(b);
	else if(c>d) System.out.println(c);
	else System.out.println(d);
}
else if(b>c&&b>d) {
	 if(c>d) System.out.println(c);
	else System.out.println(d);
}
}
}
