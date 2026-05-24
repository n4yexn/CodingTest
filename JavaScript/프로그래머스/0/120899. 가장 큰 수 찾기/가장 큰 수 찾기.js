function solution(array) {
    let index = 0;
    let max = 0;
    
    var answer = [Math.max(...array), array.indexOf(Math.max(...array))];
    return answer;
}