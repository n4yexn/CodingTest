import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1=0, max2=0, min1=0, min2=0;
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length; i++) {
                max1 = numbers[numbers.length-1];
                max2 = numbers[numbers.length-2];
                min1 = numbers[0];
                min2 = numbers[1];
        }
        if(min1*min2 > max1 * max2)
            answer = min1*min2;
        
        else
            answer = max1 * max2;
        
        return answer;
    }
}