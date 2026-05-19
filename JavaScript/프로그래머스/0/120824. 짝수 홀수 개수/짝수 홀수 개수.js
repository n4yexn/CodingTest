function solution(num_list) {
    var answer = [];
    let e = 0, o = 0;
    
    for(let i=0; i<num_list.length; i++) {
        if(num_list[i] % 2 == 0) 
            e++;
        else 
            o++;
    }
    answer = [e, o];
    return answer;
}