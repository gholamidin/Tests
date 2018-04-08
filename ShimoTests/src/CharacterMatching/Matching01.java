package CharacterMatching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Matching01 {
	public static void main(String[] args) {
		String pattern = "abbc";
		String str = "cat dog dog ca";
		boolean res = Str_Pattern(pattern, str);
		System.out.println(res);
	}
	public static boolean Str_Pattern(String pattern,String str){
		HashMap<Character,String>map = new HashMap<Character,String>();
		Set<String> set = new HashSet<String>();
		String[] word = str.split(" ");
		if(pattern.length() != word.length) {
			return false;
		}
		
		int i = 0;
		for(String s:word) {
			char p = pattern.charAt(i);
			System.out.println(p);
			if (map.containsKey(p)) {
				if(!s.equals(map.get(p))) {
					return false;
				}
			}
			else {
				if(set.contains(s)) {
					return false;
				}
	            map.put(p, s);
	            set.add(s);
	        }
			i++;
		}	
		return true;
	}
}


