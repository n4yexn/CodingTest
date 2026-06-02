function solution(n) {
    var answer = 0;    
    answer = parseInt(Math.sqrt(n));
    if(answer * answer == n)
        return 1;
    else
        return 2;
}