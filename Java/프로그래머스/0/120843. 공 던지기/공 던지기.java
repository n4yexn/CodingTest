class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        
        for(int i=0; i<k-1; i++) {
            index = (index + 2) % numbers.length; //중복합
        }
        return numbers[index];
    }
}