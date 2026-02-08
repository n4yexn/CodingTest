class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String a = "";//2
        String b = "";//1
        int n = overwrite_string.length();//7
        
        for(int i=0; i<s; i++) {
            a += my_string.charAt(i);
        }
        
        for(int i=s+n; i<my_string.length(); i++) {
            b += my_string.charAt(i);
        }
        answer = a + overwrite_string + b;
        
        return answer;
    }
}
