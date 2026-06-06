function solution(numbers, direction) {
    var answer = [];
    
    for(let i=0; i<numbers.length-1; i++){
        if(direction == "right"){
            answer[0] = numbers[numbers.length - 1];
            answer[i+1] = numbers[i];
            
        }
        else{
            answer[i] = numbers[i + 1];
            answer[numbers.length - 1] = numbers[0];
        }
    }
    return answer;
}