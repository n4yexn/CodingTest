import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        //오름차순 정렬하고 0,1번째 수 곱하기
        int answer = 0;
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length; i++) {
            answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        }
        return answer;
    }
}