package StringPlay;

public class UpperCaseLowerCaseandDigits {
public static void main(String[] args) {
	String str = "AbcDe12334#h";
	String UP="",Low="",digit="";
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') UP+=(str.charAt(i));
		else if(str.charAt(i)>='a' && str.charAt(i)<='z') Low+=(str.charAt(i));
		else if(str.charAt(i)>='0' && str.charAt(i)<='9') digit+=(str.charAt(i));
	}
	System.out.println("UpperCase: "+UP);
	System.out.println("LowerCase: "+Low);
	System.out.println("Digits: "+digit);
	
}
}
