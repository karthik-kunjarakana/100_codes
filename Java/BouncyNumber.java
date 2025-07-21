package weekone;

public class BouncyNumber {
	public static void main(String[] args) {
		String numbers ="";
		if(asce(numbers)||desc(numbers)) {
			System.out.println("Not a Bouncy Number");
		}
		else {
			System.out.println("Bouncy Number");
		}
		
	}
	public static boolean desc(String n) {
		boolean flag =true;
		for(int i =0 ;i<n.length()-1;i++) {
			if(n.charAt(i)>n.charAt(+1)) {
				flag= false;
		}
	}
	if(flag) return true;
	return false;
	}
	public static boolean asce(String n) {
		boolean flag =true;
		for(int i =0 ;i<n.length()-1;i++) {
			if(n.charAt(i)<n.charAt(+1)) {
				flag= false;
			break;
		}
		}
		if(flag) return true;
		return false;
	}	

}
