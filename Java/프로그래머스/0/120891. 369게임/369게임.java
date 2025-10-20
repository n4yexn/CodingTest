class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        
        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(a == '3' || a == '6' || a == '9') {
                answer ++;
            }
        }
        return answer;
    }
}