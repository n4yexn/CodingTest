function solution(num_list) {
    l = num_list.length;
    var answer = new Array(l);
    
    for(let i=0; i<l; i++) {
        answer[l - 1 - i] = num_list[i];    
    }
    return answer;
}