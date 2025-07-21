package weekone;

public class DecimaltoHexaDecimal {
public static void main(String[] args) {
	
int num=255;
char c =87;
String hexa ="";
while(num>0) {
	if(num%16 >9) {
		c+=num%16;
	hexa=(char)c+hexa;
	num/=16;
	c=87;
}
	else {
		hexa=num%16+hexa;
		num/=16;
	}
}
System.out.println(hexa);
}
}
