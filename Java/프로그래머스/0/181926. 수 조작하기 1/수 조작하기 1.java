class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char str[] = control.toCharArray();
        
        for(char v : str){
            if(v == 'w')
                answer += 1;
            else if(v == 's')
                answer -= 1;
            else if(v == 'd')
                answer += 10;
            else
                answer -= 10;
        }
        return answer;
    }
}



//string을 char로 쪼개 배열에 담기
//반복문 돌리며 케이스 분류