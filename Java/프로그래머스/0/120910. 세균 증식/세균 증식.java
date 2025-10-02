class Solution {
    public int solution(int n, int t) {
        int answer=n;
        
        if(( n>=1 && n <=10)&&( t>=1 && t<= 15)){
            for(int i=0; i<t; i++){
            answer *=2 ;
            }
        }
        else {
            return -1;
        }
        return answer;
    }
}