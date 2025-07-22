package StringPlay;

public class VowelsandConsonants {
public static void main(String[] args) {
	String str = "Hello";
	String vowels = "aeiou";
	System.out.println("No of Vowels: "+isVowel(str,vowels));
	System.out.println("No of Consonants: "+(str.length()-isVowel(str,vowels)));
}
static int isVowel(String s,String v) {
	s= s.toLowerCase();
	int count =0;
	String arr1=s.toLowerCase();
	for (int i = 0; i < arr1.length(); i++) {
		if(v.contains(arr1.charAt(i)+"")) count++;
	}
	return count;
	}
}

