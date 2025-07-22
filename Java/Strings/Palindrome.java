package StringPlay;

public class Palindrome {
public static void main(String[] args) {
	//StringBuilder + reverse() method
	String s="level";
	StringBuilder str= new StringBuilder(s); // 
	String rev = str.reverse().toString();
	System.out.println(rev);
	System.out.println(rev.equals(s)?"Palindrome":"Not a Palindrome");
	
	//Primitive method to trace and do it.
	String newString= "";
	
	for (int i = s.length()-1; i >=0; i--) {
		newString+=s.charAt(i);
	}
	
	System.out.println(newString);
	System.out.println(newString.equals(s)?"Palindrome":"Not a Palindrome");
	
	System.out.println(reverser(s));
	System.out.println(reverser(s).equals(s)?"Palindrome":"Not a Palindrome");

}

static String reverser(String str) {
	StringBuilder reverseString = new StringBuilder();
	char arr[]= str.toCharArray();
	for(int i= arr.length-1;i>=0;i--) {
		reverseString.append(arr[i]);
	}
	return reverseString.toString();
}
}
