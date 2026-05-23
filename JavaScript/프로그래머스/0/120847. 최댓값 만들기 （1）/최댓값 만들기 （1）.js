function solution(numbers) {
    let answer;
     numbers.sort((a, b) => a - b);
    
    for(let i=0; i<numbers.length; i++){
        answer = numbers[i] * numbers[i-1];
    }
   return answer;
}