class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i=0; i<rsp.length(); i++) {
            char g = rsp.charAt(i);
            
            if(g == '0') {
                answer += 5;
            }
            else if(g == '2') {
                answer += 0;
            }
            else
                answer += 2;
        }
        return answer;
    }
}