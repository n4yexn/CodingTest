function solution(array) {
    var answer = 0;
    
    array.sort((a, b) => a-b);
    
    let a = (array.length -1) / 2;
    answer = array[a]
    return answer;
}