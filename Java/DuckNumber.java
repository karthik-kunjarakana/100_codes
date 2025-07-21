package weekone;

public class DuckNumber {
public static void main(String[] args) {
	String Numbers = "1023";
	if(Numbers.charAt(0)=='0') 
		System.out.println("Not a Duck Number");
//	}else {
//	for(int i=1;i<Numbers.length();i++) {
//		if(Numbers.charAt(i)=='0') {
//			System.out.println("Duck Number");
//		}
//		
//		else System.out.println("Not a Duck Number");
//	}
//	}
	
		else {
			int num2 = Integer.parseInt(Numbers);
			boolean flag=false;
			while(num2!=0) {
				int dig=num2%10;
				if(dig==0) {
					flag =true;
				break;
			}
				num2/=10;
			System.out.println(flag?"Duck Number":"Not a Duck Number");
}
}
}
}
