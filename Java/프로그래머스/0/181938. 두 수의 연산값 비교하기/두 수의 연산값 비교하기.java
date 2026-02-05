class Solution {
    public int solution(int a, int b) {
        
        int sum1 = 2 * a * b;
        int sum2 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        if(sum1 > sum2){
            return sum1;
        }else
            return sum2;
    }
}