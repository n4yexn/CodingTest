class Solution {
    public int[] solution(int n) {
        int d = 0;
        int num = (n+1)/2;
        int[] answer = new int[num];
    
            for(int i=0; i<num; i++) {
                answer[i] = (i*2)+1;
            }
        return answer;
    }
}