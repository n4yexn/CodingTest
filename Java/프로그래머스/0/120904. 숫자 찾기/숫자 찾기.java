class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String n = String.valueOf(num);
        char a[] = n.toCharArray();//num을 char로 변환해 배열에 담기
        
        for(int i=0; i<a.length; i++) { //반복문
            if(a[i] == k+'0')
                return i+1;
        }
        return -1;
    }
}