class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i<included.length; i++) {
            int n = a + d*i;
            
            if(included[i] == true)
                answer += n;
        }
        return answer;
    }
}