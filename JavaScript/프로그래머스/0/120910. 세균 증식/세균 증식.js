function solution(n, t) {
    let count = 0;
    
    while(count < t){
        n = n + n;
        count++;
    }
    return n;
}