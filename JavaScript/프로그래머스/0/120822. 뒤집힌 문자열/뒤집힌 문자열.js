function solution(my_string) {
    var answer = '';
    let l = my_string.length;
    
    for(i = 0; i<l; i++){
        answer += my_string[l -1 - i];
    }
    return answer;
}