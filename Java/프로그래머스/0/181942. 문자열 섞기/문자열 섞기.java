class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char a [] = str1.toCharArray();
        char b [] = str2.toCharArray();
        
        for(int i=0; i<str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i); 
        }
        
        return answer;
    }
}