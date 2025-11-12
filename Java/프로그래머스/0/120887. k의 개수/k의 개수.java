class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char t = (char)(k + '0');

        for(int a=i; a<j+1; a++) { //i부터 j까지 배열 돌리기
            //a를 스트링으로 만들고 char로 분리하기..?
            String b = String.valueOf(a);
                for(int c=0; c<b.length(); c++){
                    if(b.charAt(c) == t)
                        answer++;   
                }
        }
   
        return answer;
    }
}