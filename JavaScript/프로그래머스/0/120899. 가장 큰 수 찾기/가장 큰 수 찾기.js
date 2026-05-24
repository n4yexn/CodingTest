function solution(array) {
    let index = 0;
    let max = Math.max(...array);
    
    for(let i=0; i<array.length; i++){
        if (array[i] == max)
            index = i
    }
    var answer = [max, index];
    return answer;
}