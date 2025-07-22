package StringPlay;

public class VowelsandConsonants2 {
public static void main(String[] args) {
	String str = "hello";
	int vowels= 0,consonants= 0;
	String vow= "aeiou";
	for (int i = 0; i < str.length(); i++) {
		if(vow.contains(String.valueOf(str.charAt(i)))) vowels++;
		else consonants++;
	}
	System.out.println(vowels);
	System.out.println(consonants);
	}
}
