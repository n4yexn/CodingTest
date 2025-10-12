import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(Character.isDigit(a)) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(Character.isDigit(a)) {
                answer[index] = a - '0';
                index++;
            }        
        }
        Arrays.sort(answer);
        return answer;
    }
}