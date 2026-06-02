function solution(n) {
    var answer = [];
    if(n % 2 != 0)
        answer.push(n);
    
    while(n > 1){
        if(n % 2 == 0){ //짝수이면
            n = n-1;
            answer.push(n);
        } else{ //홀수이면
            n = n-2;
            answer.push(n);
        }
    }
    answer.sort((a, b) => a-b);
    return answer;
}