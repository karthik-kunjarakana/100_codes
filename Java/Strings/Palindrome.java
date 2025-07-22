package StringPlay;

public class Palindrome {
public static void main(String[] args) {
	String s="level";
	StringBuilder str= new StringBuilder(s); // 
	String rev = str.reverse().toString();
	System.out.println(rev);
	System.out.println(rev.equals(s)?"Palindrome":"Not a Palindrome");
	
	
	String newString= "";
	for (int i = s.length()-1; i >=0; i--) {
		newString+=s.charAt(i);
	}
	System.out.println(newString);
	System.out.println(newString.equals(s)?"Palindrome":"Not a Palindrome");
}
}
