class Solution {
    public int solution(int[] array, int height) {
        int answer = 0; //키 배열과 머쓱이의 키는 주어짐
       
        for(int i=0; i<array.length; i++) {
            if(height < array[i]) {
                answer++;//머쓱이보다 키가 크면 카운트
            }
        }
        return answer;
    }
}