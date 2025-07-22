package StringPlay;

public class ReverseASentence {
public static void main(String[] args) {
//String s = "Java is a high level language";	
//StringBuilder str= new StringBuilder();
//String strs= reverser(s);
//System.out.println(strs);
//String st= reverser(strs);
//String[] arr = strs.split(" ");
//System.out.println(arr.length);
//for (int i = arr.length-1; i >0; i++) {
//	str.append(arr[i]);
//}
//System.out.println(Arrays.toString(arr);
//}
//
//static String reverser(String str) {
//	StringBuilder reverseString = new StringBuilder();
//	char arr[]= str.toCharArray();
//	for(int i= arr.length-1;i>=0;i--) {
//		reverseString.append(arr[i]);
//	}
//	return reverseString.toString();
//
String str="Java is a High Level Language";
String arr[]=str.split(" ");
StringBuilder reversedString = new StringBuilder();
for(int i =0;i<arr.length;i++) {
	reversedString.append(reverser(arr[i]+" "));
}
System.out.println(reversedString.toString());
	
	
	
}
static String reverser(String str) {
StringBuilder reverseString = new StringBuilder();
char arr[]= str.toCharArray();
for(int i= arr.length-1;i>=0;i--) {
	reverseString.append(arr[i]);
}
return reverseString.toString();
}
}
