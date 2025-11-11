class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n]; //배열 크기 지정
        
        for(int i=0; i<num_list.length; i++) {
            int a = i / n;
            int b = i % n;
            answer[a][b] = num_list[i];
        }
        return answer;
    }
}