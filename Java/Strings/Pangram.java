package StringPlay;

public class Pangram {
public static void main(String[] args) {
	String Str = " The quick brown fox jumps over the lazy dog";
	Str=Str.toLowerCase();
	boolean Pan=true;
	for(char i ='a';i<='z';i++) {
		if(Str.indexOf(i)==-1) {
		Pan=false;
		break;
		
		}
	}
	System.out.println(Pan?"True":"False");
}
}
