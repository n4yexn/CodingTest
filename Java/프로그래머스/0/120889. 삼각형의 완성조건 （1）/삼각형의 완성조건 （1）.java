class Solution {
    public int solution(int[] sides) {
        int answer = 0, sum = 0;
        int max = sides[0];
        
        for(int i=0; i<3; i++) {
            sum += sides[i];
            
            if(sides[i] > max) {
                max = sides[i];
            }
        }
        for(int i=0; i<3; i++) {
                if(max < sum - max) {
                    answer = 1;
                }
               else
                    answer = 2;            
            }
         return answer;
    }
}