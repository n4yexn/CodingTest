import java.util.*;

class Solution {
    public int solution(int[] array) {
        //배열을 스트링으로 만들고
        //스트링으로 만든 배열을 char 배열로 만들기.
        //char 배열의 값을 int 타입으로 바꾸기
        //반복문 돌리면서 7의 개수 카운팅 
        int answer = 0;
        
        String s = Arrays.toString(array);
        char[] arr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '7') {
                answer ++;
            }
        }
        return answer;
    }
}