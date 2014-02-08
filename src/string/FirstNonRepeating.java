package string;

import java.util.HashMap;

public class FirstNonRepeating {

	public static void main(String[] args ){
		//String S = "geeksforgeeks"; // f
		String S = "geeksforgeeksFirstoa"; // o
		System.out.println(getFirstNonRepeating(S) );
	}
	
	public static char getFirstNonRepeating(String S){
		char [] chs = S.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c: chs){
			if(c>='A' && c <='Z')
				c= (char) (c-('Z'-'z'));
			int count = 1;
			if(map.containsKey(c))
				count += map.get(c);
			map.put(c, count);
		}
		for(char c: chs){
			if(c>='A' && c <='Z')
				c= (char) (c-('Z'-'z'));
			if(map.get(c) == 1)
				return c;
		}
		
		
		return '!';
	}
	
}
