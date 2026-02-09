class Solution {
    public int solution(int a, int b) {
        
        int stra = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int strb = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        int answer = Math.max(stra, strb);
        return answer;
    }
}

//숫자를 스트링으로 연결
//스트링을 숫자로 변경 