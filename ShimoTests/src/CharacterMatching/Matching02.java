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
        	 //ƥ����ͬ�ַ���ָ�붼ǰ��
        	 if (p < pattern.length() && str.charAt(s) == pattern.charAt(p)){
                s++;
                p++;
             } 
             else if (p < pattern.length() && pattern.charAt(p) == '*'){//����*�ţ����*λ���ƶ�pָ�룬
                p_Idx = p;
                s_Idx = s;
                p++; 
             }
             // ���p���ָ��*���ƶ�sָ�룻
             else if (p_Idx != -1){
                p = p_Idx + 1;
                s_Idx++;
                s = s_Idx;
             }        
             else return false;
        }
        //���ʣ�µ�pattern��
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;
        return p == pattern.length();
}
}