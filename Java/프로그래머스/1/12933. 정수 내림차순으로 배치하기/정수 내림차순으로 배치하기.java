import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        char a [] = str.toCharArray();
        Arrays.sort(a);//long을 String으로 바꿔 배열에 담기
        
        String b = String.valueOf(a); //배열을 String으로 변환
        
        StringBuilder sb = new StringBuilder(b);
        sb.reverse();//오름차순으로 정렬된 String을 뒤집기
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}