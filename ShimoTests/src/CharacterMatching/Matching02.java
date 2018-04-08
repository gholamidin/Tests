package CharacterMatching;
//patternMatches('ab*', 'abcd') // returns true
//patternMatches('a*b', 'aabb') // returns true
//patternMatches('a*b', 'aabbc') // returns false
public class Matching02 {

	public static void main(String[] args) {
		String str ="aaabbc";
		String pattern = "a*b";
		boolean res = patternMatches(str, pattern);
		System.out.println(res);

	}
	static boolean patternMatches(String str, String pattern) {
        int s = 0, p = 0, p_Idx = -1, s_Idx = 0;            
            
        while (s < str.length()){ 
        	 //匹配相同字符，指针都前移
        	 if (p < pattern.length() && str.charAt(s) == pattern.charAt(p)){
                s++;
                p++;
             } 
             else if (p < pattern.length() && pattern.charAt(p) == '*'){//遇到*号，标记*位置移动p指针，
                p_Idx = p;
                s_Idx = s;
                p++; 
             }
             // 如果p最后指向*，移动s指针；
             else if (p_Idx != -1){
                p = p_Idx + 1;
                s_Idx++;
                s = s_Idx;
             }        
             else return false;
        }
        //检查剩下的pattern；
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;
        return p == pattern.length();
}
}