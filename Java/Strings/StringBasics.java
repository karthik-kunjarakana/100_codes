package StringPlay;

public class StringBasics {
	public static void main(String[] args) {
		String str1="Hello"; // Located in the String Constant Pool
		String str2=new String("Hello"); //Heap Memory
		System.out.println(str1==str2);
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.equals(str2));

		String s1= "hello world";
		String s2="hello"+" world"; //Compile time concatenation
		System.out.println(s1==s2);
		
		StringBuilder strings = new StringBuilder("Hello");
		strings.append("world");
		strings.trimToSize();
		System.out.println(strings);
	}

}
