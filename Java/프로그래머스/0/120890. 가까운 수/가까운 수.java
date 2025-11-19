class Solution {
    public int solution(int[] array, int n) {
        //배열에 들어있는 수와 n의 차의 절댓값을 구해
        //값이 제일 작은 배열의 수를 리턴
        int answer = array[0];
        int cp = Math.abs(n - array[0]);//비교값
        
        for(int i=1; i<array.length; i++) {
        int min = Math.abs(n - array[i]);//뺀 값
            if(min < cp || (min == cp && array[i] < answer)) {
                cp = min;
                answer = array[i];
            }
        }
        return answer;
    }
}