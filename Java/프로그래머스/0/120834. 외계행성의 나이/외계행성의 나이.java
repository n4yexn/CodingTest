class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        
        for(int i=0; i<s.length(); i++) {
            char num = s.charAt(i);
            char nn = (char)('a' +( num - '0'));
                answer += nn;
        }
        
        return answer;
    }
}