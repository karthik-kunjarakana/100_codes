package StringPlay;

public class ConvertEvenIndextoUpperCase {
	public static void main(String[] args) {
		String str1="abcdefgh";
		String str2="";
		for (int i = 0; i < str1.length(); i++) {
			if(i%2==0) {
				str2+= str1.toUpperCase().charAt(i);
		}
			else
				str2+=str1.charAt(i);
	}
		System.out.println(str2);
	}
}
