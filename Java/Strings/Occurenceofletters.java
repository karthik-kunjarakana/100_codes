package StringPlay;

public class Occurenceofletters {
public static void main(String[] args) {
	String s= "missisipi";
	String checked = "";
	for(int i=0;i<s.length();i++) {
	if(checked.contains(s.charAt(i)+"")) continue;
	System.out.println(s.charAt(i)+" = " +countletter(s.charAt(i),s));
	checked+=s.charAt(i);
	}
}
static int countletter(char st,String s) {
	int count=0,counts=0;
	for (int i = 0; i < s.length(); i++)  {
			if(st ==s.charAt(i) )
				count++;
		}
	counts=count;
	count=0;
	return counts;
		
	}
}

