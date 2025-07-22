package StringPlay;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOccurences {
public static void main(String[] args) {
	String str = "Missisipi";
	Map<Character, Integer> map = new LinkedHashMap<>();
			for(char c:str.toCharArray()) {
				map.put(c,map.getOrDefault(c, 0)+1);
			}
			System.out.println(map);
}
}
