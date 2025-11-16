import java.util.*;

class Solution {
    public int solution(String my_string) {
        //문자열을 알파벳 기준으로 나누고 배열에 담기
        //배열의 값들을 숫자로 변경
        //배열을 순회하면서 값을 더하고 배열에 ""값 차례가 오면 안더하기 
        int answer = 0;
        String [] arr = my_string.split("[a-zA-Z]");
    
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals(""))
                answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}