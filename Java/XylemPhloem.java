package weekone;

public class XylemPhloem {
public static void main(String[] args) {
int num=1212;
if(num<=99)System.out.println("Enter a valid number");
else {
int sum1 =num%10;
num/=10;
int sum2=0;
while(num>9) {
	sum2+=num%10;
	num/=10;
}
sum1+=num;
System.out.println(sum1==sum2?"Xylem Number":"Phloem Number");
}
}
}


