class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int a=0, b=0, c=0;
        
        for(int i=0; i<3; i++) {
            a = box[0] /n;
            b = box[1] /n;
            c = box[2] /n;
        }
        answer = a*b*c;
        return answer;
    }
}