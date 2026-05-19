function solution(n) {
    var answer = 0;
    
//     if(n % 2 != 0)
//         n = n-1;
        
//     while(n > 0) {
//         answer += n;
//         n = n - 2;
//     }
    
//     return answer;
    
    for(let i=0; i<=n; i+=2)
        answer +=i;
    return answer;
}