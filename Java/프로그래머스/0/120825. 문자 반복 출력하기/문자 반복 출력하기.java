class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            String c = String.valueOf(my_string.charAt(i));
            answer += c.repeat(n);
        }
        
        return answer;
    }
}