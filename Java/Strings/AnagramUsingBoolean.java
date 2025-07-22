package StringPlay;

import java.util.Arrays;

public class AnagramUsingBoolean {
public static void main(String[] args) {
	String s1="Listen";
	String s2="Lilent";
	System.out.println(isAnagram(s1,s2));

}
static boolean isAnagram(String s1, String s2) {
	if(s1.length()!=s2.length())return false;
	char[] arr1=s1.toLowerCase().toCharArray();
	char[] arr2=s2.toLowerCase().toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0;i<arr1.length;i++) {
		if(!(arr1[i]==arr2[i])) return false;
	}
	return true;
}
}
