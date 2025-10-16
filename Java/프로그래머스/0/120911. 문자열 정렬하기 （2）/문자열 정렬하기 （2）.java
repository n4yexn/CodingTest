import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        char answer[] = my_string.toCharArray(); //문자열을 배열로 변환
        for(int i=0; i<answer.length; i++) { //반복문
        answer[i] = Character.toLowerCase(answer[i]); //소문자로 변경
        }
        Arrays.sort(answer);//오름차순 정렬
        return new String(answer);
    }
}