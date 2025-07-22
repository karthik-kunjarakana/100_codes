package StringPlay;

public class PangramV3 {
	public static void main(String[] args) {
	String Str = " The quick brown fox jumps over the lazy dog";
	System.out.println(isPangram(Str));
	}
	static boolean isPangram(String str) {
		str=str.toLowerCase();
		for (char c = 'a';c<='z';c++) {
			if(str.contains(String.valueOf(c))==false) // or str.contains(c+"")
			return false;
		}
		return true;
	}

}
