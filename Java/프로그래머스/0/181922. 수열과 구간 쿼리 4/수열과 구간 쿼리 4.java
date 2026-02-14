class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i<queries.length; i++) { //sek 구하기 
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j = 0; j<arr.length; j++) {
                if(j >= s && j <= e && j % k == 0) //j가 k의 배수이면 + j의 범위 지정
                    arr[j] = arr[j] + 1; //arr[j] + 1;
            }         
        }
        return arr;
    }
}