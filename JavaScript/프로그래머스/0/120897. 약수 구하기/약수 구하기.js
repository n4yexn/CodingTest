function solution(n) {
    var answer = [];
    let i=0; 
    for(let i=1; i<n+1; i++){
        if(n % i == 0) {
            let k = n / i;
            answer.push(k);
        }
    }
    answer.sort((a,b) => a-b);
    return answer;
}


//.sort
//1씩 키워가며 검사