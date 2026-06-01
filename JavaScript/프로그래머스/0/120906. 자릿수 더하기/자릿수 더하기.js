function solution(n) {
    var answer = 0;
    s = n.toString();
    
    for(let i=0; i<n; i++) {
         answer += Number(s.charAt(i));
    }
    return answer;
}