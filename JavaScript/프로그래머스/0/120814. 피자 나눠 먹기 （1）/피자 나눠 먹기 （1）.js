function solution(n) {
    var answer = 0;
    
    if(n < 8)
        answer = 1; //나머지 처리
    else if(n % 7 == 0)
        answer = n / 7;
    else
        answer = Math.floor(n / 7) + 1;
    
    
    return answer;
}