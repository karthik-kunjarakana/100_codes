package StringPlay;

public class LetterOccurences {
public static void main(String[] args) {
	String str  = "apple";
	String checked = " ";
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(checked.contains(ch+"")) continue;
		int count = 0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==ch)
				count++;
		}
		System.out.println(ch +"="+count);
		checked+=ch;
	}
}
}
