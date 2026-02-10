class Solution {
    public String solution(String code) {
        String answer = "";
        String empty = "EMPTY";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char code1 = code.charAt(i);
            //1이 나올때 마다 모드가 변경
            //0이면 짝수일때 추가
            //1이면 홀수일때 추가
            
            if(code1 == '1'){
                mode = 1 - mode; //모드는 0으로 시작하고, 1이 나오면 모드 변경
                continue;
            }
            if(mode == 0 && i % 2 == 0){
                answer += code1;
            }else if(mode == 1 && i % 2 != 0)
                answer += code1;
        }
        return answer.equals("") ? empty : answer;
            
    }
}