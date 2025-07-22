package StringPlay;

public class StringMultiplier {
	//Store each character in given string n times
	public static void main(String[] args) {
		String str = "abc";
		int n=4;
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <n; j++) {
				str2+=str.charAt(i);
				
			}
		}
		System.out.println(str2);
	}
}
