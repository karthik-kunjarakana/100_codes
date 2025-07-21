package weekone;

public class LargestofFour {
public static void main(String[] args) {
	int a=8,b=100,c=25,d=23;
//	int max=a;
//	if(max<b) max=b;
//	if(max<c)max=c;
//	if(max<d)max=d;
//	System.out.println(max);

if(a>b&&a>c&&a>d)
	System.out.println(a);
else if(b>c&&b>d)
	System.out.println(b);
else if(c>d)
	System.out.println(c);
else
	System.out.println(d);
}
}
