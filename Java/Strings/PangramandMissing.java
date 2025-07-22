package StringPlay;

public class PangramandMissing {
public static void main(String[] args) {
	String Str = " The quk brown fox jumps over the lazy dog";
	Str=Str.toLowerCase();
	boolean Pan=true;
	for(char i ='a';i<='z';i++) {
		if(Str.indexOf(i)==-1) {
		Pan=false;
		break;
		
		}
	}
	System.out.println(Pan?"Pangram":"Not a Pangram");
	System.out.println("Missing letters are");
	for(char i ='a';i<='z';i++) {
		if(Str.indexOf(i)==-1) {
		System.out.println(i);
}
}
}
}
