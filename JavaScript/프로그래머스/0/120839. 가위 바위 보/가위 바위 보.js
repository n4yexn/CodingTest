function solution(rsp) {
    var answer = '';
    let arr = [];
    for(let i=0; i<rsp.length; i++) {
        if(rsp.charAt(i) == 2)
            arr.push(0);
        else if (rsp.charAt(i) == 0)
            arr.push(5);
        else
            arr.push(2);
        answer = arr.join('');
    }
    return answer;
}