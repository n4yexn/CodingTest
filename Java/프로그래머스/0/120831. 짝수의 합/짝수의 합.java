class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n/2 + 1; i++) {
            answer += 2*i; 
        }
        return answer;
    }
}