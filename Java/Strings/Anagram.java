package StringPlay;


public class Anagram {
public static void main(String[] args) {
	String s1="Listen";
	String s2="Silent";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	int count=0;
	if(s1.length()!=s2.length()) System.out.println("Not an Anagram");
	else {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
			if(s1.charAt(j) == s2.charAt(i)) 
			count++;
		}
		}
		if(count==s1.length()) System.out.println("Anagram");
		else System.out.println("Not an Anagram");
	}
}
}
