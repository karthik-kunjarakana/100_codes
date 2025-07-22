package StringPlay;

public class EndingwithUpperCase {
public static void main(String[] args) {
	String str="AsAbdweFZ";
	String str1="";
	String str2="";
	for(int i =0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			str1+=(str.charAt(i));
		else if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			str2+=(str.charAt(i));
	}
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str2+=str1);
}
}
