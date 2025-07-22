package StringPlay;

public class FirstNonRepeatingCharacter {
public static void main(String[] args) {
	String str  = "hkhhhbhahhkhahhhcv";
	String checked = " ";
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(checked.contains(ch+"")) continue;
		int count = 0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)==ch)
				count++;
		}
		if(count ==1) {
			System.out.println("First Non-Repeating Character: "+ch);
			break;
	}
		checked+=ch;
	}
	
}
}