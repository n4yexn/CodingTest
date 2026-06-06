function solution(num, k) {
    let s = num.toString();
    
    for(let i=0; i<s.length; i++){
        if(s.charAt(i) == k)
            return i + 1;
    }
    return -1;
}